package pizzaprincipal;

import java.util.HashMap;
import java.util.Map;

public class Pizza {

    private String sabor;
    private double preço;
    Map<Integer, String> ingredientes = new HashMap<Integer, String>();
    private int indice = 0;
    private int numero_ingredientes = 0;
    static int numero_pizzas = 0;

    public Pizza(String sabor) {
        this.sabor = sabor;
        numero_pizzas++;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPreço() {
        if (ingredientes.size() <= 2) {
            preço = 15;
        } else if (ingredientes.size() <= 5) {
            preço = 20;
        } else {
            preço = 23;
        }
        return preço;
    }

    public Map<Integer, String> getIngredientes() {
        return ingredientes;
    }

    public int getIndice() {
        return indice;
    }

    public int getNumero_ingredientes() {

        return numero_ingredientes;
    }

    public static int getNumero_pizzas() {
        return numero_pizzas;
    }

    public void escrevaNumeroPizzas() {
        System.out.println("Numero de pizzas=" + getNumero_pizzas());
    }

    public void adicionaIngredientes(String ingrediente) {
        ingredientes.put(indice++, ingrediente);
        contabilizaIngrediente();

    }

    public void contabilizaIngrediente() {
        numero_ingredientes++;
    }

    public void listarIngredientes() {
        for (int i = 0; i < ingredientes.size(); i++) {
            System.out.println(i + 1 + "-" + ingredientes.get(i));

        }
    }

}

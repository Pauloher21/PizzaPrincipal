/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaprincipal;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private double totalPagar = 0;
    ArrayList<Pizza> CarrinhoDeCompras = new ArrayList();
    private Object ingredientes;

    public ArrayList<Pizza> getCarrinhoDeCompras() {
        return CarrinhoDeCompras;
    }

    public Object getIngredientes() {
        return ingredientes;
    }

    public void adicionarItem(Pizza obj) {
        if (obj.getNumero_ingredientes() > 0) {
            CarrinhoDeCompras.add(obj);
            totalPagar += obj.getPreço();

        } else {
            System.out.println("Item Não incluido");
        }

    }

    public int totalPizzasAdicionadas() {
        return CarrinhoDeCompras.size();
    }

    public double getTotalPagar() {
        return totalPagar;
    }

}

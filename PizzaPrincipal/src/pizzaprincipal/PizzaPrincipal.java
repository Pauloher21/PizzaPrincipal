/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaprincipal;

/**
 *
 * @author Unip
 */
public class PizzaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza p1 = new Pizza("mozzarela");
        p1.adicionaIngredientes("Mussarella");
        p1.adicionaIngredientes("azeitonas");
        System.out.println("\n Ingredientes da pizza p1");
                System.out.println("\n Preços da pizza=" + p1.getPreço());
        p1.listarIngredientes();
        p1.contabilizaIngrediente();
        Pizza p2 = new Pizza("Margherita");
        p2.adicionaIngredientes("Mozzarella de Buffala");
        p2.adicionaIngredientes("Tomate");
        p2.adicionaIngredientes("Manjericão");
        System.out.println("\n Ingredientes da pizza p2");
        System.out.println("\n Preços da pizza=" + p2.getPreço());
        p2.listarIngredientes();
        p2.contabilizaIngrediente();
        Pizza p3 = new Pizza("Portuguesa");
        p3.adicionaIngredientes("Ovo");
        p3.adicionaIngredientes("queijo");
        p3.adicionaIngredientes("Presunto");
        p3.adicionaIngredientes("Cebola");
        p3.adicionaIngredientes("Tomate");
        p3.adicionaIngredientes("Bacon");
        p3.adicionaIngredientes("Ervilha");
        System.out.println("\n Ingredientes da pizza p3");
        System.out.println("\n Preços da pizza=" + p3.getPreço());
        p3.listarIngredientes();
        p3.contabilizaIngrediente();
        p1.escrevaNumeroPizzas();
       

    }

}

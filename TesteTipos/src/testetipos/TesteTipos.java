/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author maria
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        System.out.println("------------");
        String valor2 = "40";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
        System.out.println("------------");
        String valor3 = "35.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.println(idade3);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = teclado.nextInt();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextInt();
        System.out.printf("A nota de %s é %.2f \n", nome, nota); 
        /*float nota = 9.5f;
        float notao = 2.5f;
        String nome = "Mariana";
        //System.out.println("A nota é " + nota); //sout + tab
        System.out.printf("A nota é %.2f \n", nota); // %.2f é pra ter 2 números depois da virgula
        System.out.printf("A nota de %s é %.2f \n", nome, nota); // %s é string
        System.out.format("A nota de %s é %.1f \n", nome, notao); // %s é string
        */
}
    
}

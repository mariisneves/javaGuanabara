/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author maria
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n [] = new int [4];
        int n [] = {3, 2, 8, 7, 5, 4}; //elementos 0, 1, 2, 3, 4, 5;
        
        for(int c=0; c<=5; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]); //n[c] mostra os valores de cada posição
        }
    }
    
}

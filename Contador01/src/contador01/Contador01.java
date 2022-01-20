/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author maria
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc<4) {
            System.out.println("Cambalhota " + (cc+1));
            cc++;
        }
        System.out.println("------------");
        int cc2 = 0;
        while (cc2<=10) {
            cc2++;
            if (cc2 == 5 || cc2 ==7) {
                continue; //ele não vai imprimir quando cc2 for 5 ou 7
            }
            System.out.println("Cambalhota2 " + cc2);
        }
        System.out.println("------------");
        int cc3 = 0;
        while (cc3<=10) {
            cc3++;
            if (cc3 == 2 || cc3 == 3 || cc3 == 4) {
                continue;
            }
            if (cc3 ==7) {
                break; //ele vai parar a repetição
            }
            System.out.println("Cambalhota3 " + cc3);
        }
    }
    
}

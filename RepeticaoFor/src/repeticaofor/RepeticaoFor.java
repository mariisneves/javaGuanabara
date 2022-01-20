/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author maria
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc=0; cc<=4; cc++) {
            System.out.println("Cambalhota " + cc);
        }
        System.out.println("--------------------");
        
        for (int cc2=5; cc2<=15; cc2+=2) {
            System.out.println("Cambalhota " + cc2);
        }
        System.out.println("--------------------");
        
        for (int cc3=15; cc3>=5; cc3-=2) {
            System.out.println("Cambalhota " + cc3);
        }
        System.out.println("--------------------");
        
        for (int cc4=0; cc4<=100; cc4+=20) {
            System.out.println("Cambalhota " + cc4);
        }
    }
    
}

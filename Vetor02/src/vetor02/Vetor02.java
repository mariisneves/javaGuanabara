/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

/**
 *
 * @author maria
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun"};
        int tot[] = {31, 28, 31, 30, 31, 30};
        for(int c=0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias.");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author maria
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informa um número: <br />[Para interromper, digite 0]</html>"));
            s += n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html> <strong> RESULTADO FINAL</strong> " + "<br /> A somatória vale " + s + "</html>");
        
    }
    
}

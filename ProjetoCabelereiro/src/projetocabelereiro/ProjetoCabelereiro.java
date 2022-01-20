/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetocabelereiro.telas.cabeleireiro.ManterCabeleireiro;
import projetocabelereiro.telas.cabeleireiro.clientecab.ManterClienteCab;
import projetocabelereiro.telas.cliente.ManterCliente;
import projetocabelereiro.telas.usuario.ManterUsuario;


/**
 *
 * @author roberta.peixoto
 */


public class ProjetoCabelereiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        if(ManterUsuario.valida()) {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("1 - MANTER_CLIENTE, 2 - MANTER_CABELEIREIRO, 3 - MANTER CLIENTE_CAB"));
        if (ops == 1) ManterCliente.montarTela();
        if (ops == 2) ManterCabeleireiro.montarTela();
        if (ops == 3) ManterClienteCab.montarTela();
        if (ops == 4) ManterUsuario.montarTela();
        } else {
            JOptionPane.showMessageDialog(null,"Usuário Inválido");
        }
    }



}






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.telas.cabeleireiro.clientecab;


import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import projetocabelereiro.controller.ControleClientecab;
import projetocabelereiro.modelo.bean.ClienteCab;


/**
 *
 * @author roberta.peixoto
 */
public class ManterClienteCab {
    
    
    private static int id;
    private static int idCli;
    private static int idCab;
    private static String servico;
   

    public static void montarTela() throws SQLException, ClassNotFoundException {
        
        int ops = Integer.parseInt(JOptionPane.showInputDialog("1 - INSERIR, 2 - BUSCAR, 3 - ALTERAR, 4 - EXCLUIR, 5 - LISTAR"));
        if (ops == 1) inserir();
        if (ops == 2) buscar();
        if (ops == 3) alterar();
        if (ops == 4) excluir();
        if (ops == 5) listar();
             
    }

    private static void inserir() throws SQLException, ClassNotFoundException {
        
         idCli = Integer.parseInt(JOptionPane.showInputDialog("ID_Cli"));
         idCab = Integer.parseInt(JOptionPane.showInputDialog("ID_Cab"));
         servico = JOptionPane.showInputDialog("SERVICO");
         ClienteCab clientecabEntrada = new ClienteCab(0,idCli,idCab,servico);
         ControleClientecab contClicab = new ControleClientecab();
         ClienteCab clicaSaida = contClicab.inserir(clientecabEntrada);
         JOptionPane.showMessageDialog(null, clicaSaida.toString());
  
    }

    private static void buscar() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        ClienteCab ccEntrada = new ClienteCab(id);
        ControleClientecab contCC = new ControleClientecab();
        ClienteCab ccSaida = contCC.buscar(ccEntrada);
        JOptionPane.showMessageDialog(null, ccSaida.toString());
        
        
      
    }

    private static void alterar() throws SQLException, ClassNotFoundException {
        
        
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        idCli = Integer.parseInt(JOptionPane.showInputDialog("ID_Cli"));
        idCab = Integer.parseInt(JOptionPane.showInputDialog("ID_Cab"));
        servico = JOptionPane.showInputDialog("SERVICO");
        ClienteCab ccEntrada = new ClienteCab(id,idCli,idCab,servico);
        ControleClientecab contCC = new ControleClientecab();
        ClienteCab ccSaida = contCC.alterar(ccEntrada);
        JOptionPane.showMessageDialog(null, ccSaida.toString());
        
    }

    private static void excluir() throws SQLException, ClassNotFoundException {
         id  = Integer.parseInt(JOptionPane.showInputDialog("ID"));
         ClienteCab clientecaboEntrada = new ClienteCab(id);
         ControleClientecab contClicab = new ControleClientecab();
         ClienteCab clicaSaida = contClicab.excluir(clientecaboEntrada);
         JOptionPane.showMessageDialog(null, clicaSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
        
        
        
        servico = JOptionPane.showInputDialog("servico");
        ClienteCab ccEntrada = new ClienteCab(servico);
        ControleClientecab contCC = new ControleClientecab();
        List<ClienteCab> listaCC = contCC.listar(ccEntrada);
        listaCC.forEach((ccL) -> {
            JOptionPane.showMessageDialog(null,ccL.toString() + " CLIENTE = " + ccL.getCli().getNome() + " CAB = " + ccL.getCa().getNome() );
        });
    }
}
    
             
             

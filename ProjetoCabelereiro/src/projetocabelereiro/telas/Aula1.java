/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.telas;

import javax.swing.JOptionPane;
import projetocabelereiro.modelo.bean.Cabeleireiro;
import projetocabelereiro.modelo.bean.Cliente;
import projetocabelereiro.modelo.bean.ClienteCab;

/**
 *
 * @author roberta.peixoto
 */
public class Aula1 {
    
   public static void main(String[] args) {
       
       
     
       //JOPTION CLIENTE
       
      
       
       int idCli = Integer.parseInt(JOptionPane.showInputDialog("ID CLIENTE"));
       String nomeCli = JOptionPane.showInputDialog("NOME CLIENTE");
       String cpfCli = JOptionPane.showInputDialog("CPF cliente");
       String servico = JOptionPane.showInputDialog("SERVICO");
       String horarioCli = JOptionPane.showInputDialog("HORARIO");
       
       Cliente cli = new Cliente(idCli,nomeCli,cpfCli,servico,horarioCli);
       
       
       
       
       // JOPTION CABELEIREIRO
       
      
       
       int idCab = Integer.parseInt(JOptionPane.showInputDialog("ID CABELEIREIRO"));
       String nomeCab = JOptionPane.showInputDialog("NOME CABELEIREIRO");
       String cpfCab = JOptionPane.showInputDialog("CPF CABELEIREIRO");
       String especializacao = JOptionPane.showInputDialog("ESPECIALIZACAO");
       String horarioCab = JOptionPane.showInputDialog("HORARIO CABELEIREIRO");
       
       
       Cabeleireiro cab = new Cabeleireiro(idCab,nomeCab,cpfCab,especializacao,horarioCab);
       
      
       //JOPTION CLIENTECAB
       
       
       int idClienteCab = Integer.parseInt(JOptionPane.showInputDialog("ID CLIENTECAB"));
       String Servico = JOptionPane.showInputDialog("SERVICO");
       
       
       ClienteCab clientecab = new ClienteCab(idClienteCab,cli.getId(),cab.getId(),Servico);
       
       //
       
      
       
       
       clientecab.setCli(cli); 
       clientecab.setCab(cab); 
       
       
       
       
       
       //IMPRESSAO
       System.out.println("nome do cliente e cabeleireiro = " + clientecab.toString());
       System.out.println("nome do cliente = " + clientecab.getCli().getNome());
       System.out.println("nome do cabeleireiro = " + clientecab.getCa().getNome());
       
       
   }
    
}

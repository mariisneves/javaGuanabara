/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.telas.cabeleireiro;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import projetocabelereiro.controller.ControleCabeleireiro;
import projetocabelereiro.modelo.bean.Cabeleireiro;

/**
 *
 * @author roberta.peixoto
 */
public class ManterCabeleireiro {

      private static int id;
      private static String nome;
      private static String cpf;
      private static String especializacao;
      private static String horario;
    
    public static void montarTela() throws SQLException, ClassNotFoundException {
        
        int ops = Integer.parseInt(JOptionPane.showInputDialog("1 - INSERIR, 2 - BUSCAR, 3 - ALTERAR, 4 - EXCLUIR, 5 - LISTAR"));
        if (ops == 1) inserir();
        if (ops == 2) buscar();
        if (ops == 3) alterar();
        if (ops == 4) excluir();
        if (ops == 5) listar();
             
    }

    private static void inserir() throws SQLException, ClassNotFoundException {
       
         nome = JOptionPane.showInputDialog("NOME");
         cpf = JOptionPane.showInputDialog("CPF");
         especializacao = JOptionPane.showInputDialog("ESPECIALIZACAO");
         horario = JOptionPane.showInputDialog("HORARIO");
         Cabeleireiro cabeleireiroEntrada = new Cabeleireiro(0,nome,cpf,especializacao,horario);
         ControleCabeleireiro contCa = new ControleCabeleireiro();
         Cabeleireiro caSaida = contCa.inserir(cabeleireiroEntrada);
         JOptionPane.showMessageDialog(null, caSaida.toString());
  
    }

    private static void buscar() throws SQLException, ClassNotFoundException {
         id  = Integer.parseInt(JOptionPane.showInputDialog("ID"));
         Cabeleireiro cabeleireiroEntrada = new Cabeleireiro(id);
         ControleCabeleireiro contCa = new ControleCabeleireiro();
         Cabeleireiro caSaida = contCa.buscar(cabeleireiroEntrada);
         JOptionPane.showMessageDialog(null, caSaida.toString());
    }

    private static void alterar() throws SQLException, ClassNotFoundException {
         id  = Integer.parseInt(JOptionPane.showInputDialog("ID"));
         nome = JOptionPane.showInputDialog("NOME");
         cpf = JOptionPane.showInputDialog("CPF");
         especializacao = JOptionPane.showInputDialog("ESPECIALIZACAO");
         horario = JOptionPane.showInputDialog("HORARIO");
         Cabeleireiro cabeleireiroEntrada = new Cabeleireiro(id,nome,cpf,especializacao,horario);
         ControleCabeleireiro contCa = new ControleCabeleireiro();
         Cabeleireiro caSaida = contCa.alterar(cabeleireiroEntrada);
         JOptionPane.showMessageDialog(null, caSaida.toString());
    }

    private static void excluir() throws SQLException, ClassNotFoundException {
         id  = Integer.parseInt(JOptionPane.showInputDialog("ID"));
         Cabeleireiro cabeleireiroEntrada = new Cabeleireiro(id);
         ControleCabeleireiro contCa = new ControleCabeleireiro();
         Cabeleireiro caSaida = contCa.excluir(cabeleireiroEntrada);
         JOptionPane.showMessageDialog(null, caSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
         nome = JOptionPane.showInputDialog("NOME");
         Cabeleireiro cabeleireiroEntrada = new Cabeleireiro(nome);
         ControleCabeleireiro contCa = new ControleCabeleireiro();
         List <Cabeleireiro> listaCa = contCa.listar(cabeleireiroEntrada);
         listaCa.forEach((caL) -> {
         JOptionPane.showMessageDialog(null,caL.toString());
    });
    
}
}
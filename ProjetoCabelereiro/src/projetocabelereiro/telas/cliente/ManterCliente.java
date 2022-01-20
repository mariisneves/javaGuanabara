/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.telas.cliente;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import projetocabelereiro.controller.ControleCliente;
import projetocabelereiro.modelo.bean.Cliente;

/**
 *
 * @author roberta.peixoto
 */
public class ManterCliente {
    
         private static int id;
         private static String nome;
         private static String cpf;
         private static String servico;
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
         servico = JOptionPane.showInputDialog("SERVICO");
         horario = JOptionPane.showInputDialog("HORARIO");
         Cliente clienteEntrada = new Cliente(0,nome,cpf,servico,horario);
         ControleCliente contCl = new ControleCliente();
         Cliente clSaida = contCl.inserir(clienteEntrada);
         JOptionPane.showMessageDialog(null, clSaida.toString());
  
    }

    private static void buscar() throws SQLException, ClassNotFoundException {
         id  = Integer.parseInt(JOptionPane.showInputDialog("ID"));
         Cliente clienteEntrada = new Cliente(id);
         ControleCliente contCl = new ControleCliente();
         Cliente clSaida = contCl.buscar(clienteEntrada);
         JOptionPane.showMessageDialog(null, clSaida.toString());
    }

    private static void alterar() throws SQLException, ClassNotFoundException {
         id  = Integer.parseInt(JOptionPane.showInputDialog("ID"));
         nome = JOptionPane.showInputDialog("NOME");
         cpf = JOptionPane.showInputDialog("CPF");
         servico = JOptionPane.showInputDialog("SERVICO");
         horario = JOptionPane.showInputDialog("HORARIO");
         Cliente clienteEntrada = new Cliente(id,nome,cpf,servico,horario);
         ControleCliente contCl = new ControleCliente();
         Cliente clSaida = contCl.alterar(clienteEntrada);
         JOptionPane.showMessageDialog(null, clSaida.toString());
    }

    private static void excluir() throws SQLException, ClassNotFoundException {
         id  = Integer.parseInt(JOptionPane.showInputDialog("ID"));
         Cliente clienteEntrada = new Cliente(id);
         ControleCliente contCl = new ControleCliente();
         Cliente clSaida = contCl.excluir(clienteEntrada);
         JOptionPane.showMessageDialog(null, clSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
         nome = JOptionPane.showInputDialog("NOME");
         Cliente clienteEntrada = new Cliente(nome);
         ControleCliente contCl = new ControleCliente();
         List <Cliente> listaCl = contCl.listar(clienteEntrada);
         listaCl.forEach((clL) -> {
         JOptionPane.showMessageDialog(null,clL.toString());
    });
    
}
}

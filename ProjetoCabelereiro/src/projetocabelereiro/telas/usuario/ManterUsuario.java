/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.telas.usuario;

import projetocabelereiro.controller.ControleUsuario;
import projetocabelereiro.modelo.bean.Usuario;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author roberta.peixoto
 */
public class ManterUsuario {
    
    public static void montarTela() throws SQLException, ClassNotFoundException {
        int ops = Integer.parseInt(JOptionPane.showInputDialog("1 - INSERIR, 2 - ALTERAR, 3 - LISTAR, 4 - BUSCAR, 5 - EXCLUIR"));
        if (ops == 1) inserir();
        if (ops == 2) alterar();
        if (ops == 3) listar();
        if (ops == 4) buscar();
        if (ops == 5) excluir();
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        String login = JOptionPane.showInputDialog("LOGIN");
        String senha = JOptionPane.showInputDialog("SENHA");
        String status = JOptionPane.showInputDialog("STATUS");
        String tipo = JOptionPane.showInputDialog("TIPO");
        Usuario usaEntrada = new Usuario(0,login,senha,status,tipo);
        ControleUsuario contU = new ControleUsuario();
        Usuario usuSaida = contU.inserir(usaEntrada);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String login = JOptionPane.showInputDialog("LOGIN");
        String senha = JOptionPane.showInputDialog("SENHA");
        String status = JOptionPane.showInputDialog("STATUS");
        String tipo = JOptionPane.showInputDialog("TIPO");
        Usuario usaEntrada = new Usuario(id,login,senha,status,tipo);
        ControleUsuario contU = new ControleUsuario();
        Usuario usuSaida = contU.alterar(usaEntrada);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        String login = JOptionPane.showInputDialog("LOGIN");
        Usuario usaEntrada = new Usuario(login);
        ControleUsuario contU = new ControleUsuario();
        List<Usuario> listaU = contU.listar(usaEntrada);
        listaU.forEach((usuL) -> {
            JOptionPane.showMessageDialog(null,usuL.toString());
        });
    }
    
    public static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario usaEntrada = new Usuario(id);
        ControleUsuario contU = new ControleUsuario();
        Usuario usuSaida = contU.buscar(usaEntrada);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
    }

    public static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario usaEntrada = new Usuario(id);
        ControleUsuario contU = new ControleUsuario();
        Usuario usuSaida = contU.excluir(usaEntrada);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
    }

    public static boolean valida() throws SQLException, ClassNotFoundException {
        boolean retorno = false;
        String login = JOptionPane.showInputDialog("LOGIN");
        String senha = JOptionPane.showInputDialog("SENHA");
        Usuario usuEntrada = new Usuario(login,senha);
        ControleUsuario contUsu = new ControleUsuario();
        Usuario usuSaida = contUsu.valida(usuEntrada);
        if(usuSaida != null) {
            retorno = true;
        }
        return retorno;
    }
    
}

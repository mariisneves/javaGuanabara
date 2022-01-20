/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.modelo.dao;


import projetocabelereiro.modelo.bean.Cliente;
import projetocabelereiro.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author roberta.peixoto
 */
public class DaoCliente {
    
      private final Connection c;
   
    public DaoCliente() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
    
    public Cliente inserir (Cliente cli) throws SQLException {
        String sql = "insert into cli_cliente" + " (cli_nome,cli_cpf,cli_servico,cli_horario)" + " values (?,?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1,cli.getNome());
            stmt.setString(2,cli.getCpf());
            stmt.setString(3,cli.getServico());
            stmt.setString(4,cli.getHorario());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                cli.setId(id);
            }
        }
        c.close();
        return cli;
    }
 
    public Cliente buscar (Cliente cli) throws SQLException {
        String sql = "select * from cli_cliente WHERE cli_id = ?";
        Cliente retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,cli.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Cliente(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                        
                // adiciona o usu à lista de pessoa
            }
        }
        c.close();
        return retorno;
    }
    public Cliente alterar (Cliente cl) throws SQLException {
       String sql = "UPDATE cli_cliente SET cli_nome = ?, cli_cpf = ?, cli_servico = ?, cli_horario = ? WHERE cli_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,cl.getNome());
            stmt.setString(2,cl.getCpf());
            stmt.setString(3,cl.getServico());
            stmt.setString(4,cl.getHorario());
            stmt.setInt(5,cl.getId());
            // executa
            stmt.execute();
        }
        return cl;

    }
    public Cliente excluir (Cliente cl) throws SQLException {
         String sql = "delete from cli_cliente WHERE cli_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,cl.getId());
            // executa
            stmt.execute();
        }
        c.close();
        return cl;
    }
    public List<Cliente> listar (Cliente cl)  throws SQLException {
        List<Cliente> listaCliente = new ArrayList<>();
        
        String sql = "select * from cli_cliente where cli_nome like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + cl.getNome()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Cliente cSaida = new Cliente(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                        
                // adiciona o usu à lista de usus
                listaCliente.add(cSaida);
            }
            
            rs.close();
        }
        return listaCliente;
    }
}

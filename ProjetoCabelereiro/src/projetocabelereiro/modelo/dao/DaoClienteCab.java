/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.modelo.dao;

import java.util.ArrayList;
import java.util.List;
import projetocabelereiro.modelo.bean.ClienteCab;
import projetocabelereiro.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author roberta.peixoto
 */
public class DaoClienteCab {
    
     private final Connection c;
       
    
     public DaoClienteCab() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();{
        }
     }
    
      public ClienteCab inserir (ClienteCab clica) throws SQLException {
        
         String sql = "insert into ccr_clica" + " (ccr_idCli,ccr_idCab,ccr_servico)" + " values (?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setInt(1,clica.getIdCli());
            stmt.setInt(2,clica.getIdCab());
            stmt.setString(3,clica.getServico());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                clica.setId(id);
            }
        }
        c.close();
        return clica;
    }
 
    public ClienteCab buscar (ClienteCab clica) throws SQLException {
        String sql = "select * from ccr_clica WHERE ccr_id = ?";
        ClienteCab retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,clica.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new ClienteCab(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4));
                        
                // adiciona o usu à lista de pessoa
            }
        }
        c.close();
        return retorno;
    }
    public ClienteCab alterar (ClienteCab clica) throws SQLException {
         String sql = "UPDATE ccr_clica SET ccr_idCli = ?, ccr_idCab = ?, ccr_servico = ? WHERE ccr_id = ?";

        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
             stmt.setInt(1,clica.getIdCli());
            stmt.setInt(2,clica.getIdCab());
            stmt.setString(3,clica.getServico());
            stmt.setInt(4,clica.getId());
            // executa
            stmt.execute();
        }
        return clica;

    }
    public ClienteCab excluir (ClienteCab clica) throws SQLException {
         String sql = "delete from ccr_clica WHERE ccr_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,clica.getId());
            // executa
            stmt.execute();
        }
        c.close();
        return clica;
    }
    public List<ClienteCab> listar (ClienteCab cl)  throws SQLException {
        List<ClienteCab> listaClica = new ArrayList<>();
        
        String sql = "select * from ccr_clica where ccr_servico like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + cl.getServico()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                ClienteCab clSaida = new ClienteCab(                 
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4));
                        
                // adiciona o usu à lista de usus
                listaClica.add(clSaida);
            }
            
            rs.close();
        }
        return listaClica;
    }
}

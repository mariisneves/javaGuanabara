/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.modelo.dao;

import projetocabelereiro.modelo.bean.Cabeleireiro;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projetocabelereiro.util.ConexaoDb;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
;

/**
 *
 * @author roberta.peixoto
 */
    public class DaoCabeleireiro {
    
      private final Connection c;
   
    public DaoCabeleireiro() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
    
    public Cabeleireiro inserir (Cabeleireiro cab) throws SQLException {
        String sql = "insert into cab_cab" + " (cab_nome,cab_cpf,cab_especializacao,cab_horario)" + " values (?,?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1,cab.getNome());
            stmt.setString(2,cab.getCpf());
            stmt.setString(3,cab.getEspecializacao());
            stmt.setString(4,cab.getHorario());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                cab.setId(id);
            }
        }
        c.close();
        return cab;
    }
 
    public Cabeleireiro buscar (Cabeleireiro cab) throws SQLException {
        String sql = "select * from cab_cab WHERE cab_id = ?";
        Cabeleireiro retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,cab.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Cabeleireiro(
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
    public Cabeleireiro alterar (Cabeleireiro cab) throws SQLException {
       String sql = "UPDATE cab_cab SET cab_nome = ?, cab_cpf = ?, cab_especializacao = ?, cab_horario = ? WHERE cab_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,cab.getNome());
            stmt.setString(2,cab.getCpf());
            stmt.setString(3,cab.getEspecializacao());
            stmt.setString(4,cab.getHorario());
            stmt.setInt(5,cab.getId());
            // executa
            stmt.execute();
        }
        return cab;

    }
    public Cabeleireiro excluir (Cabeleireiro cab) throws SQLException {
         String sql = "delete from cab_cab WHERE cab_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,cab.getId());
            // executa
            stmt.execute();
        }
        c.close();
        return cab;
    }
    public List<Cabeleireiro> listar (Cabeleireiro cab)  throws SQLException {
        List<Cabeleireiro> listaCab = new ArrayList<>();
        
        String sql = "select * from cab_cab where cab_nome like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + cab.getNome()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Cabeleireiro cabSaida = new Cabeleireiro(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                        
                // adiciona o usu à lista de usus
                listaCab.add(cabSaida);
            }
            
            rs.close();
        }
        return listaCab;
    }
}


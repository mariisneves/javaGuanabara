/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.modelo.dao;


import projetocabelereiro.modelo.bean.Usuario;
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
public class DaoUsuario {
    
    private final Connection c;
    
    public DaoUsuario() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
    
     public Usuario inserir (Usuario u) throws SQLException {
        
        String sql = "insert into usu_usuario" + " (usu_login,usu_senha,usu_status,usu_tipo)" + " values (?,?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1,u.getLogin());
            stmt.setString(2,u.getSenha());
            stmt.setString(3,u.getStatus());
            stmt.setString(4,u.getTipo());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                u.setId(id);
            }
        }
        c.close();
        return u;
    }
    
    public Usuario buscar (Usuario u) throws SQLException {
        String sql = "select * from usu_usuario WHERE usu_id = ?";
        Usuario retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,u.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Usuario(
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

    public List<Usuario> listar (Usuario u) throws SQLException {
         // usus: array armazena a lista de registros
        List<Usuario> listaP = new ArrayList<>();
       
        String sql = "select * from usu_usuario where usu_login like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + u.getLogin()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Usuario pSaida = new Usuario(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                // adiciona o usu à lista de usus
                listaP.add(pSaida);
            }
            rs.close();
        }
        return listaP;
    }

    public Usuario alterar (Usuario u) throws SQLException {
        String sql = "UPDATE usu_usuario SET usu_login = ?, usu_senha = ?, usu_status = ?, usu_tipo = ? WHERE usu_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,u.getLogin());
            stmt.setString(2,u.getSenha());
            stmt.setString(3,u.getStatus());
            stmt.setString(4,u.getTipo());
            stmt.setInt(5,u.getId());
            // executa
            stmt.execute();
        }
        return u;

    }

    public Usuario excluir (Usuario p) throws SQLException {
         String sql = "delete from usu_usuario WHERE usu_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getId());
            // executa
            stmt.execute();
        }
        c.close();
        return p;
    }

    public Usuario valida (Usuario u) throws SQLException {
        String sql = "select * from usu_usuario WHERE usu_login = ? and usu_senha = ?";
        Usuario retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,u.getLogin());
            stmt.setString(2,u.getSenha());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Usuario(
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

}

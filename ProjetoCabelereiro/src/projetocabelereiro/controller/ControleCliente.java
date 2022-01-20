/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.controller;


import projetocabelereiro.modelo.bean.Cliente;
import projetocabelereiro.modelo.dao.DaoCliente;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author roberta.peixoto
 */
public class ControleCliente {
    
    static DaoCliente daoCl;
    
   public Cliente inserir(Cliente ClEntrada) throws SQLException, ClassNotFoundException {
        daoCl = new DaoCliente();
        Cliente clSaida = daoCl.inserir(ClEntrada); 
        return clSaida;
    }
   
   public Cliente alterar(Cliente ClEntrada) throws SQLException, ClassNotFoundException {
        daoCl = new DaoCliente();
        Cliente clSaida = daoCl.alterar(ClEntrada); 
        return clSaida;
    }
    public Cliente excluir(Cliente ClEntrada) throws SQLException, ClassNotFoundException {
        daoCl = new DaoCliente();
        Cliente clSaida = daoCl.excluir(ClEntrada); 
        return clSaida;
    }
     public Cliente buscar(Cliente ClEntrada) throws SQLException, ClassNotFoundException {
        daoCl = new DaoCliente();
        Cliente clSaida = daoCl.buscar(ClEntrada); 
        return clSaida;
    }
     
     public List<Cliente> listar(Cliente ClEntrada) throws SQLException, ClassNotFoundException {
        daoCl = new DaoCliente();
        List<Cliente> clSaida = daoCl.listar(ClEntrada); 
        return clSaida;
    }
    
}

   
   
   
   
   
   
   
   
  
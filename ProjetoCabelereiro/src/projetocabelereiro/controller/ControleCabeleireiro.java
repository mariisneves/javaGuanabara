/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.controller;

import java.util.List;
import projetocabelereiro.modelo.bean.Cabeleireiro;
import projetocabelereiro.modelo.dao.DaoCabeleireiro;
import java.sql.SQLException;

/**
 *
 * @author roberta.peixoto
 */
public class ControleCabeleireiro {
    
    static  DaoCabeleireiro daoCa;
    
 public Cabeleireiro inserir(Cabeleireiro cabeleireiroEntrada) throws SQLException, ClassNotFoundException {
        daoCa = new DaoCabeleireiro();
        Cabeleireiro caSaida = daoCa.inserir(cabeleireiroEntrada); 
        return caSaida;
    }
   
   public Cabeleireiro alterar(Cabeleireiro cabeleireiroEntrada) throws SQLException, ClassNotFoundException {
        daoCa = new DaoCabeleireiro();
        Cabeleireiro caSaida = daoCa.alterar(cabeleireiroEntrada); 
        return caSaida;
    }
    public Cabeleireiro excluir(Cabeleireiro cabeleireiroEntrada) throws SQLException, ClassNotFoundException {
        daoCa = new DaoCabeleireiro();
        Cabeleireiro caSaida = daoCa.excluir(cabeleireiroEntrada); 
        return caSaida;
    }
     public Cabeleireiro buscar(Cabeleireiro cabeleireiroEntrada) throws SQLException, ClassNotFoundException {
        daoCa = new DaoCabeleireiro();
        Cabeleireiro caSaida = daoCa.buscar(cabeleireiroEntrada); 
        return caSaida;
    }
     
     public List<Cabeleireiro> listar(Cabeleireiro cabeleireiroEntrada) throws SQLException, ClassNotFoundException {
        daoCa = new DaoCabeleireiro();
        List<Cabeleireiro> caSaida = daoCa.listar(cabeleireiroEntrada); 
        return caSaida;
    }
    
}

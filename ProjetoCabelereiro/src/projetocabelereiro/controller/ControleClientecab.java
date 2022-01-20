/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.controller;

import java.sql.SQLException;
import java.util.List;
import projetocabelereiro.modelo.bean.Cabeleireiro;
import projetocabelereiro.modelo.bean.Cliente;
import projetocabelereiro.modelo.bean.ClienteCab;
import projetocabelereiro.modelo.dao.DaoClienteCab;

/**
 *
 * @author roberta.peixoto
 */
public class ControleClientecab {
    
    DaoClienteCab daoClca = null;
    static ControleCliente daoCl;
    static ControleCabeleireiro daoCa;
    
    
  
    public ClienteCab inserir (ClienteCab clica) throws SQLException, ClassNotFoundException {
        daoClca = new DaoClienteCab();
        return daoClca.inserir(clica);
    }
    public ClienteCab buscar (ClienteCab clica) throws SQLException, ClassNotFoundException {
        //daoClca = new DaoClienteCab();
       // return daoClca.buscar(clica);
   // }
    
    
        daoClca = new DaoClienteCab();
        ClienteCab clicaSaida = daoClca.buscar(clica);
        ControleCliente daoCl = new ControleCliente();
        ControleCabeleireiro daoCa  = new ControleCabeleireiro();
        Cliente clEntrada = new Cliente(clicaSaida.getIdCli());
        Cabeleireiro caEntrada = new Cabeleireiro(clicaSaida.getIdCab());
        Cliente clSaida = daoCl.buscar(clEntrada);
        Cabeleireiro caSaida = daoCa.buscar(caEntrada);
        clicaSaida.setCli(clSaida);
        clicaSaida.setCab(caSaida);
    

        return clicaSaida;
    }
      
    
    
    
    
    
     public ClienteCab alterar (ClienteCab clica) throws SQLException, ClassNotFoundException {
        daoClca = new DaoClienteCab();
        return daoClca.alterar(clica);
    }
      public ClienteCab excluir (ClienteCab clica) throws SQLException, ClassNotFoundException {
        daoClca = new DaoClienteCab();
        return daoClca.excluir(clica);
    }
       public List<ClienteCab> listar (ClienteCab clica) throws SQLException, ClassNotFoundException {
        daoClca = new DaoClienteCab();
        List<ClienteCab> listaCC = daoClca.listar(clica);
        for (ClienteCab listaCC2 : listaCC) {
            ControleCliente cCl = new ControleCliente();
            ControleCabeleireiro cCa = new ControleCabeleireiro();
            Cliente clEntrada = new Cliente (listaCC2.getIdCli());
            Cabeleireiro caEntrada = new Cabeleireiro (listaCC2.getIdCab());
            Cliente clSaida = cCl.buscar(clEntrada);
            Cabeleireiro caSaida = cCa.buscar(caEntrada);
            listaCC2.setCli(clSaida);
            listaCC2.setCab(caSaida);
        }
        return listaCC;
        
        
        
        
        
        
        

       
           // Cabeleireiro caE = new Cabeleireiro(ccL.getIdCab());
           // ControleCliente contCli = new ControleCliente();
            //ControleCabeleireiro contCab = new ControleCabeleireiro();
            //Cliente cliS = contCli.buscar(cliE);
           // Cabeleireiro cabS = contCab.buscar(caE);
            //ccL.setCl(cliS);
            //ccL.setCa(cabS);
             //Cliente cliE = new Cliente(ccL.getIdCli());
        
    }
    
    
    
}

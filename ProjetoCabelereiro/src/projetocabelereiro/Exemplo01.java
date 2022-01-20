/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro;

import projetocabelereiro.modelo.bean.Cabeleireiro;
import projetocabelereiro.modelo.bean.Cliente;

/**
 *
 * @author roberta.peixoto
 */
public class Exemplo01 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cli = new Cliente(1,"Roberta","44076069838","progressiva","07.04 as 8");
        Cabeleireiro cab = new Cabeleireiro(2,"NomeCAB","4407606983x","lisos","07.04 as 8:30");
        System.out.println("ID CLIENTE = " + cli.getId());
        System.out.println("NOME CLIENTE = " + cli.getNome());
        System.out.println("ID CABELEIREIRO = " + cab.getId());
        System.out.println("NOME CABELEIREIRO = " + cab.getNome());
        System.out.println("CLIENTE = " + cli.toString());
        System.out.println("CABELEIREIRO = " + cab.toString());
        cli.setNome("GABRIEL");
        cab.setNome("MARCOS");
        System.out.println("CLIENTE = " + cli.toString());
        System.out.println("CABELEIREIRO = " + cab.toString());
        
        
    }
    
}



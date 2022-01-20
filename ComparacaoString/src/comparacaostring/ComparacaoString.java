/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author maria
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Mariana"; //String tá com S maiúsculo então é um novo objeto, um classe
        String nome2 = "Mariana";
        String nome3 = new String("Mariana"); //foi criado usando o new então não é igual os de cima
        String res;
        String res2;
        res = (nome1==nome2)? "igual":"diferente";
        System.out.println(res);
        res2 = (nome1.equals(nome3))?"conteúdo igual":"conteúdo diferente";
        //esse verifica se o que está dentro dos tipos de objetivo (conteúdo) é igual
        System.out.println(res2);
        System.out.println("------------");
    }
    
}

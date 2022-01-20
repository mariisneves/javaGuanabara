/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocabelereiro.modelo.bean;

/**
 *
 * @author roberta.peixoto
 */
public class ClienteCab {
    
    private int id;
    private int idCli;
    private int idCab;
    private String servico;
    private Cliente cl;
    private Cabeleireiro ca;

    public ClienteCab(int id) {
        this.id = id;
    }

    public ClienteCab(String servico) {
        this.servico = servico;
    }
    
    

    public ClienteCab(int id, int idCli, int idCab, String servico) {
        this.id = id;
        this.idCli = idCli;
        this.idCab = idCab;
        this.servico = servico;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getIdCab() {
        return idCab;
    }

    public void setIdCab(int idCab) {
        this.idCab = idCab;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Cliente getCli() {
        return cl;
    }

    public void setCli(Cliente cl) {
        this.cl = cl;
    }

    public Cabeleireiro getCa() {
        return ca;
    }

    public void setCab(Cabeleireiro ca) {
        this.ca = ca;
    }


    @Override
    public String toString() {
        return "ClienteCab{" + "id=" + id + ", idCli=" + idCli + ", idCab=" + idCab + ", servico=" + servico + '}';
    }
    
    
    
    
}

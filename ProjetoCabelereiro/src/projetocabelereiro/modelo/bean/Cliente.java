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
public class Cliente {
    //caracteristicas do cliente
    
    
    private int id;
    private String nome;
    private String cpf;
    private String servico;
    private String horario;

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(int id, String nome, String cpf, String servico, String horario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.servico = servico;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", servico=" + servico + ", horario=" + horario + '}';
    }
    
    
    
}

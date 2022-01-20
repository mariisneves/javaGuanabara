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
public class Cabeleireiro {
    
    
    private int id;
    private String nome;
    private String cpf;
    private String especializacao;
    private String horario;

    public Cabeleireiro(int id) {
        this.id = id;
    }

    public Cabeleireiro(String nome) {
        this.nome = nome;
    }

    public Cabeleireiro(int id, String nome, String cpf, String especializacao, String horario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.especializacao = especializacao;
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

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Cabeleireiro{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", especializacao=" + especializacao + ", horario=" + horario + '}';
    }
    
    
    
    
    
    
}

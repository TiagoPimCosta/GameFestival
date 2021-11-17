package Backend;

import java.io.Serializable;

public class Colaborador implements Serializable {
    private String nome;
    private String morada;
    private String numtel;
    private String funcao;

    public Colaborador(String nome, String morada, String numtel, String funcao) {
        this.nome = nome;
        this.morada = morada;
        this.numtel = numtel;
        this.funcao = funcao;
    }
    
    public String getNome() {
        return nome;
    }
    public String getMorada() {
        return morada;
    }
    public String getNumtel() {
        return numtel;
    }
    public String getFuncao() {
        return funcao;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    } 
}
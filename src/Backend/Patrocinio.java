package Backend;

import java.io.Serializable;

public class Patrocinio implements Serializable {
    private String nome;
    private double contribuicao;

    public Patrocinio(String nome, double contribuicao) {
        this.nome = nome;
        this.contribuicao = contribuicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setContribuicao(double contribuicao) {
        this.contribuicao = contribuicao;
    }

    public String getNome() {
        return nome;
    }
    public double getContribuicao() {
        return contribuicao;
    }
}
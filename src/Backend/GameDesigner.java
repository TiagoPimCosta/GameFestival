package Backend;

import java.io.Serializable;

/**
 * @author Tiago Costa
 */

public class GameDesigner implements Serializable {
    private String nome;
    private String telefone;
    private String NIF;
    private double cache;
    
    public GameDesigner(String nome, String telefone, String NIF, double cache) {
        this.nome = nome;
        this.telefone = telefone;
        this.NIF = NIF;
        this.cache = cache;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    public void setCache(double cache) {
        this.cache = cache;
    }
        
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getNIF() {
        return NIF;
    }
    public double getCache() {
        return cache;
    }
}
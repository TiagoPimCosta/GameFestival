package Backend;

import java.io.Serializable;

public class Pago extends Colaborador implements Serializable {
    private String NIF;
    private int dias;

    public Pago(String nome, String morada, String numtel, String funcao,String NIF,int dias) {
        super(nome, morada, numtel, funcao);
        this.NIF = NIF;
        this.dias = dias;
    } 
    
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    public String getNIF() {
        return NIF;
    }

    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
}
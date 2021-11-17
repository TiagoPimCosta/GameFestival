package Backend;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Bilheteira implements Serializable {
    private double preco;
    private int numBilhete;
    private ArrayList<Bilhete> listaBilhetes;

    public Bilheteira(){
        listaBilhetes = new ArrayList<>();
        this.numBilhete = 1;
        this.preco = 10;
    }

    public ArrayList<Bilhete> getListaBilhetes() {
        return listaBilhetes;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
            this.preco = preco;    
    }
    
    public void adicionarBilhete(Bilhete bi){
        bi.setNum(numBilhete);
        listaBilhetes.add(bi);
        numBilhete++;
    }
    
    public void registarBilhete(String data){
        Bilhete bilhete = new Bilhete(LocalDate.parse(data));
        adicionarBilhete(bilhete);
    }
    
    public int bilhetesVendidos(){
        return listaBilhetes.size(); 
    }
    public double dinheiro(){
        return (bilhetesVendidos() * preco);
    }
}
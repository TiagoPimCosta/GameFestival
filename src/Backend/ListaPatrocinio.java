package Backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class ListaPatrocinio implements Serializable {
        public ArrayList<Patrocinio> listaPatrocinios;

    public ListaPatrocinio() {
        listaPatrocinios = new ArrayList<>();
    }
    
    public void addPatrocinio(Patrocinio pat){
        listaPatrocinios.add(pat);
    }
    
    public int patrociniosRegistados(){
        return listaPatrocinios.size(); 
    }
    public double contribuicao(){
        double dinheiro = 0;
        for(Patrocinio p : listaPatrocinios){
            dinheiro += p.getContribuicao();
        }
        return dinheiro;
    }

    public ArrayList<Patrocinio> getListaPatrocinios() {
        return listaPatrocinios;
    }
}
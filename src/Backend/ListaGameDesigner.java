package Backend;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * @author Tiago
 */
public class ListaGameDesigner implements Serializable {
    private ArrayList<GameDesigner> listaGameDesigners;

    public ListaGameDesigner() {
        listaGameDesigners = new ArrayList<>();
    }

    public ArrayList<GameDesigner> getListaGameDesigners() {
        return listaGameDesigners;
    }
    
    public void addGameDesigner(GameDesigner gd){
        listaGameDesigners.add(gd);
    }
    
    public int gamedesignerRegistados(){
        return listaGameDesigners.size();
    }
    public double pagamento(){
        double x = 0;
        for(GameDesigner gd: listaGameDesigners){
            x += gd.getCache();
        }
        return x;
    }
    
}
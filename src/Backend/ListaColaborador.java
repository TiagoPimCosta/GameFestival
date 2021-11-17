package Backend;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaColaborador implements Serializable {
    private ArrayList<Colaborador> listaColaboradores;
    private double salario;
    
    public ListaColaborador() {
        listaColaboradores = new ArrayList<>();
        this.salario = 50;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Colaborador> getListaColaboradores() {
        return listaColaboradores;
    }
    
    public void addColaborador(Colaborador col){
        listaColaboradores.add(col);
    }
    public int colaboradoresRegistados(){
        return listaColaboradores.size(); 
    }
    
    public double dinheiroGasto(){
        int dias = 0;
        for(Colaborador c: listaColaboradores){
            if(c instanceof Pago){
                dias += ((Pago) c).getDias();
            }
        }
        return (dias * salario);
    }
}
package Backend;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author Tiago Costa
 */

public class ListaSessoes implements Serializable {
    public ArrayList<Sessao> listaSessoes;

    public ListaSessoes() {
        listaSessoes = new ArrayList<>();
    }

    public ArrayList<Sessao> getListaSs() {
        return listaSessoes;
    }
    
    public void addSessao(Sessao sessao){
        listaSessoes.add(sessao);
    }
    
    public int sessoesRegistadas(){
        return listaSessoes.size();
    }
    
    public boolean verificaHora(LocalDateTime data2i,LocalDateTime data2f){
        for(Sessao s: listaSessoes){
                if(!((data2i.isBefore(s.getHoraFim()) || data2i.isAfter(s.getHoraFim())) && (data2f.isBefore(s.getHoraInicio()) || data2f.isAfter(s.getHoraFim())))){
                    return false;
                }
        }
        return true;
    }
}

package Backend;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * @author Tiago Costa
 */
public class Sessao implements Serializable {
    private String jogo;
    private LocalDateTime horaInicio;
    private LocalDateTime horafim;
    private GameDesigner gd;

    public Sessao() {
    }
  
    public Sessao(String jogo,GameDesigner gd,LocalDateTime hora,int durh,int durm){
        this.jogo =jogo;
        this.gd = gd;  
        this.horaInicio = hora;
        this.horafim = alterarData(horaInicio,horafim,durh,durm);
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }
    public LocalDateTime getHoraFim() {
        return horafim;
    }
    public GameDesigner getGameDesigner() {
        return gd;
    }
    public String getJogo() {
        return jogo;
    }
    
    public void setJogo(String jogo) {
        this.jogo = jogo;
    }
    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }
    public void setHoraFim(LocalDateTime horaFim) {
        this.horafim = horaFim;
    }
    public void setGd(GameDesigner gd) {
        this.gd = gd;
    }
    
    public LocalDateTime alterarData(LocalDateTime x,LocalDateTime y,int hor,int min){
        y = LocalDateTime.of(x.getYear(),x.getMonth(),x.getDayOfMonth(),x.getHour(),x.getMinute());
        y = y.plusHours(Integer.toUnsignedLong(hor));
        y = y.plusMinutes(Integer.toUnsignedLong(min));
        return y;
    }
}
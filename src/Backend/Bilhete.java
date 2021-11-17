package Backend;

import java.io.Serializable;
import java.time.LocalDate;

public class Bilhete implements Serializable {
    private int num;
    private LocalDate data;

    public Bilhete(LocalDate data) {
        this.data = data;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }    
}
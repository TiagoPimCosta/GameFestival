package Backend;

import java.io.Serializable;

public class Voluntario extends Colaborador implements Serializable {

//////////////////////////////Constructors//////////////////////////////////////
    public Voluntario(String nome, String morada, String numtel, String funcao) {
        super(nome, morada, numtel, funcao);
    }  
}
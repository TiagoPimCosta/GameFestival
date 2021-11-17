package Backend;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Sistema implements Serializable {
    private final ListaUtilizadores utilizadores;
    private final List<RegistoAcesso> listaEntradas;
    private Utilizador utilizadorLigado;
    
    private String nome;
    private LocalDate data;
    private String local;
    private int ndias;
    private int partpermi;
    private ListaColaborador listaColaboradores;
    private ListaGameDesigner listaGameDesigners;
    private ListaSessoes listaSessoes;
    private ListaPatrocinio listaPatrocinios;
    private Bilheteira bilheteira;

    public Sistema(String nome, String data, String local, int ndias, int partpermi) {
        utilizadores = new ListaUtilizadores();   
        listaEntradas = new ArrayList<>();
        
        this.nome = nome;
        this.data = LocalDate.parse(data);
        this.local = local;
        this.ndias = ndias;
        this.partpermi = partpermi;
        
        listaColaboradores = new ListaColaborador();
        listaGameDesigners = new ListaGameDesigner();
        listaSessoes = new ListaSessoes();
        listaPatrocinios = new ListaPatrocinio();
        bilheteira = new Bilheteira();
    }                       

    public ListaUtilizadores getListaUtilizadores() {
        return utilizadores;
    }
    
    public List<RegistoAcesso> getListaEntradas() {
        return listaEntradas;
    }
    
    public boolean autenticarUtilizador(String username, String password) {        
        if (utilizadores.existe(username)) {
            try{
                Utilizador u = utilizadores.getUtilizador(username);                
                if (u.getPassword().equals(password)){
                    utilizadorLigado = u;
                    listaEntradas.add(new RegistoAcesso(u, LocalDateTime.now()));
                    return true;
                }                
            }catch (Exception e) {}                        
        }        
        return false;        
    }
    
    public Utilizador getUtilizadorLigado() {
        return utilizadorLigado;
    }
    
    public void inicializar() throws ListaUtilizadores.UtilizadorDuplicadoException {
        utilizadores.adicionar(new Administrador("admin", "admin", "Aministrador"));
        utilizadores.adicionar(new Utilizador("user1", "1234", "Utilizador 1"));
        utilizadores.adicionar(new Utilizador("user2", "1234", "Utilizador 2"));        
    }
    
    public void terminar() {
        System.exit(0);
    }  
    ////////////////////////////////////////////////////////////////////////////
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setNdias(int ndias) {
        this.ndias = ndias;
    }
    public void setPartpermi(int partpermi) {
        this.partpermi = partpermi;
    }
    
    
    public String getNome() {
        return nome;
    }
    public LocalDate getData() {
        return data;
    }
    public String getLocal() {
        return local;
    }
    public int getNdias() {
        return ndias;
    }
    public int getPartpermi() {
        return partpermi;
    }
    public ListaColaborador getListaColaboradores() {
        return listaColaboradores;
    }
    public ListaSessoes getListaSessoes() {
        return listaSessoes;
    }
    public ListaGameDesigner getListaGameDesigners() {
        return listaGameDesigners;
    }
    public ListaPatrocinio getListaPatrocinios() {
        return listaPatrocinios;
    }
    public Bilheteira getBilheteira() {
        return bilheteira;
    }
    
    public int numerodeGameDesignersEmSessoes(){
        ArrayList<GameDesigner> l = new ArrayList<>();
        int dias;
        for(Sessao c: getListaSessoes().getListaSs()){
            GameDesigner gd = c.getGameDesigner();
            if(!(l.contains(gd))){
                l.add(gd);
            }
        }
        return l.size();
    }
    public int diaMaior(){
        int dia = 0;
        int somatorio = 0;
        
        for(int i = 0; i < ndias;i++){
            int NumBilhetes = 0;
            LocalDate d = data.plusDays(i);
            for(Bilhete b : bilheteira.getListaBilhetes()){
                if(d.equals(b.getData())){
                    NumBilhetes++;
                }
            }
            if(NumBilhetes>somatorio){
                dia = (i+1);
                somatorio = NumBilhetes;
            }
        }
        return dia;
    }  
}
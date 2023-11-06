package co.edu.uniquindio.poo;


import java.util.ArrayList;

public class Enfrentamiento {
    private String lugar;
    private String fechaHora;
    private String equipoLocal;
    private String equipoVisitante;
    private ArrayList<String> juez;
    private  int resultado;
    private String estados;
    
    public Enfrentamiento(String lugar, String fechaHora, String equipoLocal, String equipoVisitante, ArrayList<String> juez,
            String estados) {
        this.lugar = lugar;
        this.fechaHora = fechaHora;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.juez = juez;
        this.estados = estados;
    }

    public String getLugar() {
        return lugar;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public ArrayList<String> getJuez() {
        return juez;
    }

    public int getResultado() {
        return resultado;
    }

    public String getEstados() {
        return estados;
    }



    
}

package co.edu.uniquindio.poo;


import java.util.ArrayList;

public class Enfrentamiento {
    private String lugar;
    private String fechaHora;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private ArrayList<String> juez;
    private  int resultado;
    private String estados = Estados.PENDIENTE+"";
    
    public Enfrentamiento(String lugar, String fechaHora, Equipo equipoLocal, Equipo equipoVisitante, ArrayList<String> juez,
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

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
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

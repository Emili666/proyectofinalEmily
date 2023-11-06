package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Enfrentamiento {
    private final String lugar;
    private final LocalDate fechaHora;
    private String equipoLocal;
    private String equipoVisitante;
    private final ArrayList<Integer> juez;
    private final int resultado;
    private final Estados estados;
    
    public Enfrentamiento(String lugar, LocalDate fechaHora, String equipoLocal, String equipoVisitante, ArrayList<Integer> juez, int resultado,
            Estados estados) {
        this.lugar = lugar;
        this.fechaHora = fechaHora;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.juez = juez;
        this.resultado = resultado;
        this.estados = estados;
    }

    public String getLugar() {
        return lugar;
    }

    public LocalDate getFechaHora() {
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

    public ArrayList<Integer> getJuez() {
        return juez;
    }

    public int getResultado() {
        return resultado;
    }

    public Estados getEstados() {
        return estados;
    }



    
}

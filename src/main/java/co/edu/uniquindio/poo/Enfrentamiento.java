package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Enfrentamiento {
    private final String lugar;
    private final LocalDate fechaHora;
    private final Equipo equipos;
    private final ArrayList<Integer> juez;
    private final int resultado;
    private final Estados estados;
    
    public Enfrentamiento(String lugar, LocalDate fechaHora, Equipo equipos, ArrayList<Integer> juez, int resultado,
            Estados estados) {
        this.lugar = lugar;
        this.fechaHora = fechaHora;
        this.equipos = equipos;
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

    public Equipo getEquipos() {
        return equipos;
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

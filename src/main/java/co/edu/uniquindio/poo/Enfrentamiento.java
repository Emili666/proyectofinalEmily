package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Enfrentamiento {
    private final String lugar;
    private final LocalDate fechaHora;
    private final Equipo equipos;
    private final Jueces Juez;
    private final int resultado;
    private final Estados estados;
    
    public Enfrentamiento(String lugar, LocalDate fechaHora, Equipo equipos, Jueces juez, int resultado,
            Estados estados) {
        this.lugar = lugar;
        this.fechaHora = fechaHora;
        this.equipos = equipos;
        Juez = juez;
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

    public Jueces getJuez() {
        return Juez;
    }

    public int getResultado() {
        return resultado;
    }

    public Estados getEstados() {
        return estados;
    }
    
}

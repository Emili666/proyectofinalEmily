package co.edu.uniquindio.poo;

import java.time.LocalDate;


public class Torneo {
    private final String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaInicioInscripciones;
    private LocalDate fechaCierreInscripciones;
    private final byte numeroParticipantes;
    private final byte limiteEdad;
    private final int valorInscripcion;
    private final TipoTorneo tipoTorneo;
<<<<<<< HEAD
    private final Genero genero;
    
=======
    private final Genero genero; //  Hacer funcion para que saque la info del enum genero y haga un set() de ella en la clase torneo.
>>>>>>> aba1293fc112886b523aeb1d2cdca4e652ad9b07

   
        
    public Torneo(String nombre, LocalDate fechaInicio, LocalDate fechaInicioInscripciones,
            LocalDate fechaCierreInscripciones, byte numeroParticipantes, byte limiteEdad, int valorInscripcion,
            TipoTorneo tipoTorneo, Genero genero) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaInicioInscripciones = fechaInicioInscripciones;
        this.fechaCierreInscripciones = fechaCierreInscripciones;
        this.numeroParticipantes = numeroParticipantes;
        this.limiteEdad = limiteEdad;
        this.valorInscripcion = valorInscripcion;
        this.tipoTorneo = tipoTorneo;
        this.genero = genero;


    }



    public String getNombre() {
        return nombre;
    }



    public LocalDate getFechaInicio() {
        return fechaInicio;
    }



    public LocalDate getFechaInicioInscripciones() {
        return fechaInicioInscripciones;
    }



    public LocalDate getFechaCierreInscripciones() {
        return fechaCierreInscripciones;
    }



    public byte getNumeroParticipantes() {
        return numeroParticipantes;
    }



    public byte getLimiteEdad() {
        return limiteEdad;
    }



    public int getValorInscripcion() {
        return valorInscripcion;
    }



    public TipoTorneo getTipoTorneo() {
        return tipoTorneo;
    }



    public Genero getGenero() {
        return genero;
    }


    public void validarGeneroTorneo(Genero genero){


    }

    
}
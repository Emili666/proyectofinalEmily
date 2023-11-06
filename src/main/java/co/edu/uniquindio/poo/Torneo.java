package co.edu.uniquindio.poo;

import java.time.LocalDate;


public class Torneo {
    private final String nombre;
    private String fechaInicio;
    private String fechaInicioInscripciones;
    private String fechaCierreInscripciones;
    private final int numeroParticipantes;
    private final int limiteEdad;
    private final int valorInscripcion;
    private  String tipoTorneo;
    private  String genero; //  Hacer funcion para que saque la info del enum genero y haga un set() de ella en la clase torneo.

   
        
    public Torneo(String nombre, String fechaInicio, String fechaInicioInscripciones,
            String fechaCierreInscripciones, int numeroParticipantes, int limiteEdad, int valorInscripcion,
            String tipoTorneo, String genero) {
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



   


    
}
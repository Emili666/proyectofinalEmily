package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Torneo {
    private final String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaInicioInscripciones;
    private LocalDate fechaCierreInscripciones;
    public  int numeroParticipantes;
    private final byte limiteEdad;
    private final int valorInscripcion;
    private final TipoTorneo tipoTorneo;
    private final Genero genero; 
    ArrayList<Equipo> equipos = new ArrayList<>(numeroParticipantes);
        



    //  Hacer funcion para que saque la info del enum genero y haga un set() de ella en la clase torneo.

   
        
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



    public int getNumeroParticipantes() {
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


    public void llenarEquipos(ArrayList <Equipo> equipos, String nombre){
      
        for (int i = 1; i <= numeroParticipantes; i++){

            nombre = JOptionPane.showInputDialog("Ingrese nombre del equipo");
            
            Equipo equipo=new Equipo(nombre);
            equipos.add(equipo);
            }
            
        }

    }



    

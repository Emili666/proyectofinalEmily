package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;


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


    public String getFechaInicio() {
        return fechaInicio;
    }


    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public String getFechaInicioInscripciones() {
        return fechaInicioInscripciones;
    }


    public void setFechaInicioInscripciones(String fechaInicioInscripciones) {
        this.fechaInicioInscripciones = fechaInicioInscripciones;
    }


    public String getFechaCierreInscripciones() {
        return fechaCierreInscripciones;
    }


    public void setFechaCierreInscripciones(String fechaCierreInscripciones) {
        this.fechaCierreInscripciones = fechaCierreInscripciones;
    }


    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }


    public int getLimiteEdad() {
        return limiteEdad;
    }


    public int getValorInscripcion() {
        return valorInscripcion;
    }


    public String getTipoTorneo() {
        return tipoTorneo;
    }


    public void setTipoTorneo(String tipoTorneo) {
        this.tipoTorneo = tipoTorneo;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void llenarEquipos(ArrayList <Equipo> equipos){
      
        for (int i = 1; i <= numeroParticipantes; i++){

            String nombre = JOptionPane.showInputDialog("Ingrese nombre del equipo");
            
            Equipo equipo=new Equipo(nombre);
            equipos.add(equipo);
            }
            
        }
    }


public 
    



    

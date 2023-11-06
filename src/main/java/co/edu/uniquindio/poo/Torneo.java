package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Torneo {
    private final String nombre;
    private String fechaInicio;
    private String fechaInicioInscripciones;
    private String fechaCierreInscripciones;
    private  int numeroParticipantes;
    private final int limiteEdad;
    private final int valorInscripcion;
    private  String tipoTorneo;
    private  String genero; //  Hacer funcion para que saque la info del enum genero y haga un set() de ella en la clase torneo.
    public int juecesPorPartido;
    public int totalJueces;
        
    ArrayList<Equipo> equipos = new ArrayList<>(numeroParticipantes);
    ArrayList<Enfrentamiento> enfrentamientos = new ArrayList();

    public Torneo(String nombre, String fechaInicio, String fechaInicioInscripciones,
        String fechaCierreInscripciones, int numeroParticipantes, int limiteEdad, int valorInscripcion,
        String tipoTorneo, String genero, int juecesPorPartido, int totalJueces) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaInicioInscripciones = fechaInicioInscripciones;
        this.fechaCierreInscripciones = fechaCierreInscripciones;
        this.numeroParticipantes = numeroParticipantes;
        this.limiteEdad = limiteEdad;
        this.valorInscripcion = valorInscripcion;
        this.tipoTorneo = tipoTorneo;
        this.genero = genero;
        this.juecesPorPartido = juecesPorPartido;
        this.totalJueces = totalJueces;
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


    public void llenarEquipos(){
      
        for (int i = 1; i <= numeroParticipantes; i++){

            String nombre = JOptionPane.showInputDialog("Ingrese nombre del equipo");
            int numeroJugadoresEquipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese EL NUM DE JUGADORES"));
            
            Equipo equipo=new Equipo(nombre, numeroJugadoresEquipo);

            equipos.add(equipo);
            equipo.llenarJugadores();

            
            }
            
        }

        // Se crean los enfrentamientos de una vez.
        public void crearEnfrentamientos(){

            int index;
            for ( index = 0; index < (equipos.size() - 1); index++) {
                

                String lugar = JOptionPane.showInputDialog("Ingrese el lugar del enfrentamiento");
                String fechaHora = JOptionPane.showInputDialog("Ingrese fecha Y hora del torneo");
                String local = equipos.get(index).getNombre();
                String visita = equipos.get(index + 1).getNombre();




            }

        }
    }



    



    

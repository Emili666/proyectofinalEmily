package co.edu.uniquindio.poo;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Equipo {
        private final String nombre;
        public int numeroJugadoresEquipo;
        
        private static int partidosGanados;
        private static int partidosPerdidos;
        private static int partidosmpatados;
        private static int puntosTotales;

        ArrayList<Jugador> jugadores = new ArrayList<>(numeroJugadoresEquipo);
        

        
        public Equipo(String nombre, int numeroJugadoresEquipo) {
            this.nombre = nombre;
            this.numeroJugadoresEquipo = numeroJugadoresEquipo;
            this.jugadores = jugadores;
            this.partidosGanados = partidosGanados;
            this.partidosPerdidos = partidosPerdidos;
            this.partidosmpatados = partidosmpatados;
        }

        public ArrayList<Jugador> getJugadores() {
            return jugadores;
        }

        public void setJugadores(ArrayList<Jugador> jugadores) {
            this.jugadores = jugadores;
        }

        public static int getPartidosGanados() {
            return partidosGanados;
        }

        public void setPartidosGanados(int ganados) {
            Equipo.partidosGanados = ganados;
        }

        public static int getPartidosPerdidos() {
            return partidosPerdidos;
        }

        public void setPartidosPerdidos(int perdidos) {
            Equipo.partidosPerdidos = partidosGanados;
        }

        public static int getPartidosEmpatados() {
            return partidosmpatados;
        }

        public void setPartidosEmpatados(int empatados) {
            Equipo.partidosmpatados = partidosmpatados;
        }

        public Equipo(String nombre) {
            this.nombre = nombre;
            
        }

        public String getNombre() {
            return nombre;
        }


       public void llenarJugadores(){
      
        for (int i = 1; i <= numeroJugadoresEquipo; i++){

            String nombre = JOptionPane.showInputDialog("Ingrese nombre del Jugador:");
            String apellido= JOptionPane.showInputDialog("Ingrese apellido del Jugador:");
            String celular = JOptionPane.showInputDialog("Ingrese celular del Jugador:");
            String email = JOptionPane.showInputDialog("Ingrese email del Jugador:");
            String fechaNacimiento=JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del Jugador:");
            String genero=JOptionPane.showInputDialog("Ingrese genero del Jugador:");
            Jugador jugador=new Jugador(nombre, apellido,celular,email, fechaNacimiento, genero);
            jugadores.add(jugador);
            }
            
        }

    public int getNumeroJugadoresEquipo() {
        return numeroJugadoresEquipo;
    }

    public void setNumeroJugadoresEquipo(int numeroJugadoresEquipo) {
        this.numeroJugadoresEquipo = numeroJugadoresEquipo;
    }   
    public void sumarPuntosGana() {
        int puntosActuales=Equipo.getPuntosTotales();

        setPuntostotales(puntosActuales + 3);

        
    }
     public void sumarPuntosEmpata() {
        int puntosActuales=Equipo.getPuntosTotales();

        setPuntostotales(puntosActuales + 1);
     }


    public void sumarPartidosGanados() {
        int partidosActuales=Equipo.getPartidosGanados();

        setPartidosGanados(partidosActuales +1);

     }
     public void sumarPartidosPerdidos() {
        int partidosActuales=Equipo.getPartidosPerdidos();

        setPartidosPerdidos(partidosActuales+1);

     }
     public void sumarPartidosEmpatados() {
        int partidosActuales=Equipo.getPartidosEmpatados();

        setPartidosEmpatados(partidosActuales +1);
     }
     public static int getPuntosTotales() {
            return puntosTotales;
        }

        public void setPuntostotales(int puntostotales) {
            Equipo.puntosTotales = puntostotales;
        }                 
    

}



    
    
   



package co.edu.uniquindio.poo;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Equipo {
        private final String nombre;
        public int numeroJugadoresEquipo;
        
        private  int partidosGanados;
        private  int partidosPerdidos;
        private  int partidosmpatados;
        private  int puntosTotales;

        ArrayList<Jugador> jugadores = new ArrayList<>(numeroJugadoresEquipo);
        

        
        public Equipo(String nombre, int numeroJugadoresEquipo) {
            this.nombre = nombre;
            this.numeroJugadoresEquipo = numeroJugadoresEquipo;
        }

        public ArrayList<Jugador> getJugadores() {
            return jugadores;
        }

        public void setJugadores(ArrayList<Jugador> jugadores) {
            this.jugadores = jugadores;
        }

        public int getPartidosGanados() {
            return partidosGanados;
        }

        public void setPartidosGanados(int ganados) {
            partidosGanados = ganados;
        }

        public  int getPartidosPerdidos() {
            return partidosPerdidos;
        }

        public void setPartidosPerdidos(int perdidos) {
            partidosPerdidos = partidosGanados;
        }

        public  int getPartidosEmpatados() {
            return partidosmpatados;
        }

        public void setPartidosEmpatados(int empatados) {
            partidosmpatados = empatados;
        }

        public Equipo(String nombre) {
            this.nombre = nombre;
            
        }

        public String getNombre() {
            return nombre;
        }


       public void llenarJugadores(){
      
        for (int i = 1; i <= numeroJugadoresEquipo; i++){

            String nombre = JOptionPane.showInputDialog("Ingrese nombre del Jugador");
            String apellido= JOptionPane.showInputDialog("Ingrese apellido del Jugador");
            String celular = JOptionPane.showInputDialog("Ingrese celular del Jugador");
            String email = JOptionPane.showInputDialog("Ingrese email del Jugador");
            String fechaNacimiento=JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del Jugador");
            String genero=JOptionPane.showInputDialog("Ingrese genero del Jugador");
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
        int puntosActuales= getPuntosTotales();

        setPuntostotales(puntosActuales + 3);

        
    }
     public void sumarPuntosEmpata() {
        int puntosActuales= getPuntosTotales();

        setPuntostotales(puntosActuales + 1);
     }


    public void sumarPartidosGanados() {
        int partidosActuales= getPartidosGanados();

        setPartidosGanados(partidosActuales +1);

     }
     public void sumarPartidosPerdidos() {
        int partidosActuales= getPartidosPerdidos();

        setPartidosPerdidos(partidosActuales+1);

     }
     public void sumarPartidosEmpatados() {
        int partidosActuales= getPartidosEmpatados();

        setPartidosEmpatados(partidosActuales +1);
     }
     public int getPuntosTotales() {
            return puntosTotales;
        }

        public void setPuntostotales(int puntostotales) {
            puntosTotales = puntostotales;
        }                 
    

}



    
    
   



package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Equipo {
        private final String nombre;
        public int numeroJugadoresEquipo;
        
        private int ganados;
        private int perdidos;
        private int empatados;
        ArrayList<Jugador> jugadores = new ArrayList<>(numeroJugadoresEquipo);
        

        
        public Equipo(String nombre, int numeroJugadoresEquipo) {
            this.nombre = nombre;
            this.numeroJugadoresEquipo = numeroJugadoresEquipo;
            this.jugadores = jugadores;
            this.ganados = ganados;
            this.perdidos = perdidos;
            this.empatados = empatados;
        }

        public ArrayList<Jugador> getJugadores() {
            return jugadores;
        }

        public void setJugadores(ArrayList<Jugador> jugadores) {
            this.jugadores = jugadores;
        }

        public int getGanados() {
            return ganados;
        }

        public void setGanados(int ganados) {
            this.ganados = ganados;
        }

        public int getPerdidos() {
            return perdidos;
        }

        public void setPerdidos(int perdidos) {
            this.perdidos = perdidos;
        }

        public int getEmpatados() {
            return empatados;
        }

        public void setEmpatados(int empatados) {
            this.empatados = empatados;
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
    

}



    
    
   



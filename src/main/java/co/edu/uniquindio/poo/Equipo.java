package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Equipo {
        private final String nombre;
      
        private ArrayList<Jugador> jugadores;
        private int ganados;
        private int perdidos;
        private int empatados;
        
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

       

        

        
    

    }



    
    
   



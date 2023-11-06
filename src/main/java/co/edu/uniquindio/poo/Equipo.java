package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Equipo {
        private final String nombre;
        private final Persona representante;
        private final ArrayList<Jugador> jugadores;
        private int ganados;
        private int perdidos;
        private int empatados;
        
        public Equipo(String nombre, Persona representante, ArrayList<Jugador> jugadores, int ganados, int perdidos,
                int empatados) {
            this.nombre = nombre;
            this.representante = representante;
            this.jugadores = jugadores;
            this.ganados = ganados;
            this.perdidos = perdidos;
            this.empatados = empatados;
        }

        public String getNombre() {
            return nombre;
        }

        public Persona getRepresentante() {
            return representante;
        }

        public ArrayList<Jugador> getJugadores() {
            return jugadores;
        }

        public int getGanados() {
            return ganados;
        }

        public int getPerdidos() {
            return perdidos;
        }

        public int getEmpatados() {
            return empatados;
        }

        public void setGanados(int ganados) {
            this.ganados = ganados;
        }

        public void setPerdidos(int perdidos) {
            this.perdidos = perdidos;
        }

        public void setEmpatados(int empatados) {
            this.empatados = empatados;
        }

        
    

    }



    
    
   



package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Jugador extends Persona {
     private final String fechaNacimiento;
     private final String genero; // Definir funcion de elegir genero
    
   
    
    

    public Jugador(String nombre, String apellido, String email, String celular, String fechaNacimiento,
            String genero) {
        super(nombre, apellido, email, celular);
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }


    public String getGenero() {
        return genero;
    }


           
            
        }



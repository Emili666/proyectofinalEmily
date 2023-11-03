package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.Period;

public class Jugador extends Persona {
     private final LocalDate fechaNacimiento;
     private final Genero genero;

    

    public Jugador(String nombre, String apellido, String email, String celular, LocalDate fechaNacimiento,
            Genero genero) {
        super(nombre, apellido, email, celular);
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public Genero getGenero() {
        return genero;
    }


    public byte calcularEdad(LocalDate fecha){
        return (byte) Period.between(fechaNacimiento, fecha).getYears();
    }
         
}

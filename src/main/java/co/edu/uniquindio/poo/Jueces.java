package co.edu.uniquindio.poo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Jueces extends Persona {
    private final String licencia;
     

    public Jueces(String nombre, String apellido, String email, String celular, String licencia) {
        super(nombre, apellido, email, celular);
        this.licencia = licencia;
    }


    public String getLicencia() {
        return licencia;
    }


}


package co.edu.uniquindio.poo;

import javax.swing.*; 

public class App {
    public static void main(String[] args) {

        int decision = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a Tounament Creator 2.0.     Presiona 1 para crear torneo nuevo, presione 2 para arreglar enfrentamientos, presione 3 para salir "));
        boolean isGenreValid = false;
        boolean isTypeValid = false;
        String tipo;
        String genero;

        Torneo current = new Torneo("", "", "", "", 0, 0,  0, "", "", 0, 0);

        while (decision != 4) {
            if (decision == 1) {

                
                String fechaInicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio con el siguiente formato d/m/a");
                String fechaInicioInscripciones = JOptionPane.showInputDialog("Ingrese la fecha de inicio de inscripciones con el siguiente formato d/m/a");
                String fechaFinalInscripciones = JOptionPane.showInputDialog("Ingrese la fecha de finalizacion de inscripciones con el siguiente formato d/m/a");

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                
                int numeroParticipantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de participantes"));
                int valorInscripcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la inscripcion"));
                int edadLimite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad limite"));
                int juecesPorPartido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jueces por partido"));
                int juecesTotales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jueces totales"));
                
                genero = JOptionPane.showInputDialog("Ingrese el genero del torneo, entre Masculino, Femenino y Mixto").toUpperCase();
                tipo = JOptionPane.showInputDialog("Ingrese el tipo del torneo, entre Nacional, Regional, Nacional o local").toUpperCase();

                while(isGenreValid == false){
                String masculino = Genero.MASCULINO+"";
                String femenino = Genero.FEMENINO+"";
                String mixto = Genero.MIXTO+"";

                if(genero.equals(masculino) || genero.equals(femenino) || genero.equals(mixto)){

                    isGenreValid = true;
                }
                else{
                    genero = JOptionPane.showInputDialog("Ingrese nuevamente el genero del torneo, entre Masculino, Femenino y Mixto").toUpperCase();
                }

                }

                while(isTypeValid == false){

                String nacional = TipoTorneo.NACIONAL+"";
                String mundial = TipoTorneo.MUNDIAL+"";
                String regional = TipoTorneo.REGIONAL+"";
                String local = TipoTorneo.LOCAL+"";

                if(tipo.equals(nacional) || tipo.equals(mundial) || tipo.equals(regional) || tipo.equals(local)){

                    isTypeValid = true;
                }
                else{
                    tipo = JOptionPane.showInputDialog("Ingrese el tipo del torneo, entre Nacional, Regional, mundial o local").toUpperCase();
                }
                }

                current.setFechaCierreInscripciones(fechaFinalInscripciones);
                current.setFechaInicio(fechaInicio);
                current.setFechaInicioInscripciones(fechaInicioInscripciones);
                current.setGenero(genero);
                current.setNombre(nombre);
                current.setNumeroParticipantes(numeroParticipantes);
                current.setJuecesPorPartido(juecesPorPartido);
                current.setTotalJueces(juecesTotales);
                current.setLimiteEdad(edadLimite);
                current.setTipoTorneo(tipo);
                current.setValorInscripcion(valorInscripcion);



                current.llenarEquipos();

        
                decision = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su elección: 1 para agregar equipo"));
            }

            if(decision == 2){


            JFrame g = new JFrame();
            JOptionPane.showMessageDialog(g, "A continuacion se van a registrar los jueces del torneo"); 
            

            current.llenarJuecesTotal();
            current.crearEnfrentamientos();
            current.resolverEnfrentamientos();

            }

           

            
        }
    }

   
}


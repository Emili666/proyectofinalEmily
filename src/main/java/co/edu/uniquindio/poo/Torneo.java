package co.edu.uniquindio.poo;


import java.util.*;

import javax.swing.*;  



public class  Torneo  implements Comparator<Equipo> {
    private String nombre;
    private String fechaInicio;
    private String fechaInicioInscripciones;
    private String fechaCierreInscripciones;
    private  int numeroParticipantes;
    private  int limiteEdad;
    private  int valorInscripcion;
    private  String tipoTorneo;
    private  String genero; //  Hacer funcion para que saque la info del enum genero y haga un set() de ella en la clase torneo.
    public int juecesPorPartido;
    public int totalJueces;

    Random rand = new Random();
    ArrayList<Jueces>juecesTotal=new ArrayList<>();
    ArrayList<Equipo> equipos = new ArrayList<>(numeroParticipantes);
    ArrayList<Enfrentamiento> enfrentamientos = new ArrayList<>();

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }
   
    public int getLimiteEdad() {
        return limiteEdad;
    }

    public void setLimiteEdad(int limiteEdad) {
        this.limiteEdad = limiteEdad;
    }

    public int getValorInscripcion() {
        return valorInscripcion;
    }

    public void setValorInscripcion(int valorInscripcion) {
        this.valorInscripcion = valorInscripcion;
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

    public int getJuecesPorPartido() {
        return juecesPorPartido;
    }

    public void setJuecesPorPartido(int juecesPorPartido) {
        this.juecesPorPartido = juecesPorPartido;
    }

    public int getTotalJueces() {
        return totalJueces;
    }

    public void setTotalJueces(int totalJueces) {
        this.totalJueces = totalJueces;
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
        public void crearEnfrentamientos() {
            JFrame f = new JFrame(); 
            
            for (int index = 0; index < equipos.size() - 1; index++) {
                Equipo local = equipos.get(index);
                
                for (int index3 = index + 1; index3 < equipos.size(); index3++) {
                    Equipo visita = equipos.get(index3);
                    
                    JOptionPane.showMessageDialog(f, "El enfrentamiento es:  " + local.getNombre() + " vs " + visita.getNombre());
                    
                    String lugar = JOptionPane.showInputDialog("Ingrese el lugar del enfrentamiento");
                    String fechaHora = JOptionPane.showInputDialog("Ingrese fecha Y hora del torneo");
                    
                    ArrayList<String> currentMatchJudges = new ArrayList<>(juecesPorPartido);
                    
                    for (int index2 = 0; index2 < juecesPorPartido; index2++) {
                        currentMatchJudges.add(juecesTotal.get(rand.nextInt(juecesPorPartido)).getLicencia());
                    }
                    
                    String estado = JOptionPane.showInputDialog("Ingrese el estado del torneo entre pendiente, enjuego, finalizado, aplazado");
                    
                    Enfrentamiento current = new Enfrentamiento(lugar, fechaHora, local, visita, new ArrayList<>(currentMatchJudges), estado);
                    
                    enfrentamientos.add(current);
                }
            }
        }
        
        
        public void llenarJuecesTotal(){

            for (int i = 1; i <= totalJueces; i++){
        
                String nombre=JOptionPane.showInputDialog("Ingrese nombre del o los jueces");
                String apellido = JOptionPane.showInputDialog("Ingrese apellido del o los jueces");
                String email = JOptionPane.showInputDialog("Ingrese  email del o los jueces");
                String celular = JOptionPane.showInputDialog("Ingrese celular del o los jueces");
                String licencia = JOptionPane.showInputDialog("Ingrese licencia del o los jueces"); 
                Jueces juezNuevo=new Jueces(nombre, apellido, email, celular, licencia);
        
                juecesTotal.add(juezNuevo);
    }
  }

  public void resolverEnfrentamientos() {
    for (int k = 0; k < enfrentamientos.size(); k++) {
        int ganador = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione el resultado del partido: " +
                        enfrentamientos.get(k).getEquipoLocal().getNombre() +
                        " vs " +
                        enfrentamientos.get(k).getEquipoVisitante().getNombre() +
                        "\n Elija 1 para victoria de " +
                        enfrentamientos.get(k).getEquipoLocal().getNombre() +
                        "\n Elija 2 para empate " +
                        "\n Elija 3 para victoria de " +
                        enfrentamientos.get(k).getEquipoVisitante().getNombre()));

        if (ganador == 1) {
            enfrentamientos.get(k).getEquipoLocal().sumarPuntosGana();
            enfrentamientos.get(k).getEquipoLocal().sumarPartidosGanados();
            enfrentamientos.get(k).getEquipoVisitante().sumarPartidosPerdidos();
        } else if (ganador == 2) {
            enfrentamientos.get(k).getEquipoLocal().sumarPartidosEmpatados();
            enfrentamientos.get(k).getEquipoLocal().sumarPuntosEmpata();
            enfrentamientos.get(k).getEquipoVisitante().sumarPartidosEmpatados();
            enfrentamientos.get(k).getEquipoVisitante().sumarPuntosEmpata();
        } else {
            enfrentamientos.get(k).getEquipoVisitante().sumarPuntosGana();
            enfrentamientos.get(k).getEquipoVisitante().sumarPartidosGanados();
            enfrentamientos.get(k).getEquipoLocal().sumarPartidosPerdidos();
        }
    }
}

public void ordenarGanadores(){

    JFrame g = new JFrame();
    JOptionPane.showMessageDialog(g, "A continuacion se van a dar los resultados del torneo"); 

     Collections.sort(equipos, new ordenarPorPuntos());
     String textoGanadores = "";
     for (Equipo equipo : equipos) {
        
        String currrent = equipo.getNombre() + "  Puntos: " + equipo.getPuntosTotales() + "\n";
        textoGanadores += currrent;
   }

   JOptionPane.showMessageDialog(g, textoGanadores);

}


@Override
public int compare(Equipo o1, Equipo o2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'compare'");
}


    
}

    



    

package co.edu.uniquindio.poo;    
import java.util.Comparator;


public class ordenarPorPuntos implements Comparator<Equipo>{

    @Override
    public int compare(Equipo o1, Equipo o2) {
        
        return o2.getPuntosTotales() - o1.getPuntosTotales();
    }
    


}



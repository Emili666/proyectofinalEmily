package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
//import java.util.Optional;
//import java.util.function.Predicate;

public record Equipo(String nombre,Persona representante,Collection<Jugador> jugadores)  {
    public Equipo{
     
    }

    public Equipo(String nombre,Persona representante){
        this(nombre,representante,new LinkedList<>());
    }

    /**
     * Permite registrar un jugador en un equipo siempre y cuando no exista ya un jugador registrado en el equipo con el mismo nombre y apellido
     * @param jugador Jugador que se desea registrar.
     */
    public void registrarJugador(Jugador jugador) {
        //validarJugadorExiste(jugador);
        jugadores.add(jugador);
    }

    
    /**
     * Permimte buscar un jugador en el equipo basado en su nombre y apellido.
     * @param jugador Jugador que se desea buscar
     * @return Optional con el jugador que coincida con el nombre y apellido del jugador buscado, 
     * o Optinal vacío en caso de no encontrar un jugador en el equipo con dicho nombre y apellido.
     
    public Optional<Jugador> buscarJugador(Jugador jugador){
        Predicate<Jugador> nombreIgual = j->j.getNombre().equals(jugador.getNombre());
        Predicate<Jugador> apellidoIgual = j->j.getApellido().equals(jugador.getApellido());
        return jugadores.stream().filter(nombreIgual.and(apellidoIgual)).findAny();
    }

    /**
     * Valida que no exista ya un jugador registrado con el mismo nombre y apellido, en caso de haberlo genera un assertion error.
     
    private void validarJugadorExiste(Jugador jugador) {
        boolean existeJugador = buscarJugador(jugador).isPresent();
     
        return existeJugador;
    }
    */
}


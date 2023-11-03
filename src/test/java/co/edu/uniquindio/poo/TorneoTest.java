package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;


import org.junit.jupiter.api.Test;

public class TorneoTest {
    private static final Logger LOG = Logger.getLogger(TorneoTest.class.getName());
     @Test
    public void datosCompletos() {
        LOG.info("Inicio de prueba datos completos...");
        // Almacenar los datos de prueba Copa Mundo|2023-10-01|2023-08-01|2023-09-15|24|0|0|LOCAL|GRUPAL
        Torneo torneo = new Torneo("Copa Mundo", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)0, 0,TipoTorneo.LOCAL,Genero.MUJERES);

        // Recuperación y verificación de datos
        assertEquals("Copa Mundo",torneo.getNombre());
        assertEquals(LocalDate.of(2023, 10, 1),torneo.getFechaInicio());
        assertEquals(LocalDate.of(2023, 8, 1),torneo.getFechaInicioInscripciones());
        assertEquals(LocalDate.of(2023, 9, 15),torneo.getFechaCierreInscripciones());
        assertEquals((byte)24,torneo.getNumeroParticipantes());
        assertEquals((byte)0,torneo.getLimiteEdad());
        assertEquals(0,torneo.getValorInscripcion());
        assertEquals(TipoTorneo.LOCAL,torneo.getTipoTorneo());
        assertEquals(Genero.MUJERES, torneo.getGenero());
        LOG.info("Fin de prueba datos completos...");
    }

}



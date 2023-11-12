package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Inicio de prueba datos completos...");
    
        Torneo torneo = new Torneo("Tounament Creator 2.0","20/3/2023" , "9/2/2023", "9/3/2023", 4, 30, 2000, "local", "masculino" , 2, 6);
        assertEquals("Tounament Creator 2.0",torneo.getNombre());
        assertEquals("20/3/2023",torneo.getFechaInicio());
        assertEquals("9/2/2023",torneo.getFechaInicioInscripciones());
        assertEquals("9/3/2023",torneo.getFechaCierreInscripciones());
        assertEquals((int)4,torneo.getNumeroParticipantes());
        assertEquals((int)30,torneo.getLimiteEdad());
        assertEquals((int)2000,torneo.getValorInscripcion());
        assertEquals("local",torneo.getTipoTorneo());
        assertEquals("masculino",torneo.getGenero());
        assertEquals((int)2,torneo.getJuecesPorPartido());
        assertEquals((int)6,torneo.getTotalJueces());
        


        LOG.info("Fin de prueba datos completos...");
    
    }
    @Test
    public void datosNulos() {
        LOG.info("Inicio de prueba datos nulos...");
        // Almacenar los datos de prueba null|null|null|null|24|0|0|null|LOCAL|GRUPAL
        assertThrows(Throwable.class, ()-> new Torneo(null, null, null, null, 0, 0, 0, null, null, 0, 0));
        LOG.info("Fin de prueba datos nulos...");

    }
    @Test
    public void limiteEdadesNegativo() {
        LOG.info("Inicio de prueba limites de edades negativo...");
        // Almacenar los datos de prueba Copa Mundo|2023-10-01|2023-08-01|2023-09-15|24|-1|0
        assertThrows(Throwable.class, ()-> new Torneo("Tounament Creator 2.0","20/3/2023" , "9/2/2023", "9/3/2023", 4,-2, 2000, "local", "masculino" , 2, 6));
        LOG.info("Fin de prueba inscripción negativa...");
    }
    @Test
    public void participantesNegativo() {
        LOG.info("Inicio de prueba datos participantes negativo...");
        assertThrows(Throwable.class, ()-> new Torneo("Tounament Creator 2.0","20/3/2023" , "9/2/2023", "9/3/2023", -4, 30, 2000, "local", "masculino" , 2, 6));
        LOG.info("Fin de prueba datos participantes negativo...");
    }
    @Test
    public void valorInscripcionNegativo() {
        LOG.info("Inicio de prueba valor inscripcion negativo...");
        assertThrows(Throwable.class, ()-> new Torneo("Tounament Creator 2.0","20/3/2023" , "9/2/2023", "9/3/2023", -4, 30, -1000, "local", "masculino" , 2, 6));
        LOG.info("Fin de prueba valor inscripcion negativo...");
    }

}



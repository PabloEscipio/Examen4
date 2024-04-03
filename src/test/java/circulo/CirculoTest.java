package circulo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Clase de pruebas unitarias para la clase "Círculo"
 */
class CirculoTest {
    static Circulo circulo = new Circulo(0);

    @BeforeEach
    void setUp() {
        circulo.setRadio(5);
    }

    @Test
    void longitud() {
        for (int i = -100; i < 100; i++) {
            circulo.setRadio(i);
            assertEquals(2 * Math.PI * circulo.getRadio(), circulo.longitud());
        }
    }

    @Test
    void superficie() {
        assertEquals(Math.PI * Math.pow(circulo.getRadio(), 2), circulo.superficie());
        circulo.setRadio(-110000);
        assertEquals(Math.PI * Math.pow(circulo.getRadio(), 2), circulo.superficie());
        circulo.setRadio(0);
        assertEquals(Math.PI * Math.pow(circulo.getRadio(), 2), circulo.superficie());
    }

    @Test
    void diametro() {
        assertEquals(circulo.getRadio() * 2, circulo.diametro());
        circulo.setRadio(-30);
        assertEquals(circulo.getRadio() * 2, circulo.diametro());
        circulo.setRadio(0);
        assertEquals(circulo.getRadio() * 2, circulo.diametro());
    }

    @Test
    void cuartaParteSuperficie50() {
    }

    @Test
    void radio() {
        assertNotNull(circulo.getRadio());
        circulo.setRadio(-20);
        assertNotNull(circulo.getRadio());
        circulo.setRadio(0);
        assertNotNull(circulo.getRadio());
    }
}
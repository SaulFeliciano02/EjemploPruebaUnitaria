import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora calculadora;

    public void escenario() {
        calculadora = new Calculadora();
    }

    @Test
    public void sumar() {
        escenario();
        assertTrue(calculadora.sumar(2,2) == (2+2));
    }

    @Test
    public void restar() {
        escenario();
        assertEquals(3, calculadora.restar(5,2));
    }

    @Test
    public void multiplicar() {
        escenario();
        assertEquals(5, calculadora.multiplicar(4,4));
    }

    @Test
    public void dividir() {
    }

    @Test
    public void main() {
    }
}
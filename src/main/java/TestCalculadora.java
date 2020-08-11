import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
    private Calculadora calculadora;

    public void escenario() {
        calculadora = new Calculadora();
    }

    public void sumar ()
    {
        assertTrue(calculadora.sumar(2,2) == (2+2));
    }
    public void restar ()
    {
        ;
    }
    public void multiplicar ()
    {

    }
    public void dividir ()
    {

    }

    public void testTestSumar() {
        assertTrue(calculadora.sumar(2,2) == (2+2));
    }

    public void testTestRestar() {
    }

    public void testTestMultiplicar() {
    }

    public void testTestDividir() {
    }

    public void testMain() {
    }
}

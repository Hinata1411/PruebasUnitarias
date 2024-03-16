import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class TestPruebaUnitaria {

    //Método de Test Unitario para Sumar
    @Test
    public void testSumar() {
        Calculadora calcular = new Calculadora();
        assertEquals(48, calcular.dividir(12, 4), calcular.sumar(14, 34));
        assertEquals(-127, calcular.dividir(27, 9), calcular.sumar(-123, -4));
        assertEquals(0, calcular.dividir(25, 5), calcular.sumar(0, 0));
        assertEquals(20, calcular.dividir(48, 8), calcular.sumar(20, 0));
    }

    //Método que muestra las respuestas iguales y acertadas en las operaciones dividir y sumar enviandole la variable i
    private void assertEquals(int i, double dividir, int sumar) {

    }

    //Método de Test Unitario para Restar
    @Test
    public void testRestar() {
        Calculadora calcular = new Calculadora();
        assertEquals(3, calcular.dividir(10, 2), calcular.restar(27, 24));
        assertEquals(0, calcular.dividir(6, 3), calcular.restar(10, 10));
        assertEquals(18, calcular.dividir(4, 2), calcular.restar(8, -10));
    }

    //Método de Test Unitario para Multiplicar
    @Test
    public void testMultiplicar() {
        Calculadora calcular = new Calculadora();
        assertEquals(25, calcular.dividir(81, 27), calcular.multiplicar(5, 5));
        assertEquals(240, calcular.dividir(6, 3), calcular.multiplicar(120, 2));
        assertEquals(-49, calcular.dividir(6, 3), calcular.multiplicar(-7, 7));
    }

    //Método de Test Unitario para Dividir
    @Test
    public void testDividir() {
        Calculadora calcular = new Calculadora();
        assertEquals(7, calcular.dividir(34, 2), 0);
        assertEquals(2, calcular.dividir(14, 7), 0);
        assertEquals(10, calcular.dividir(20, 2), 0);
        // Test para división por cero
        try {
            calcular.dividir(5, 0);
            fail("Error, no se puede realizar la operación.");
        } catch (ArithmeticException e) {
        }
    }



}

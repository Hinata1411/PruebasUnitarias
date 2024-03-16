public class Calculadora {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("ERROR. No se puede dividir el número por cero");
        }
        return (double) num1 / num2;
    }


}

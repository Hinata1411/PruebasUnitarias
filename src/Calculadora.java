public class Calculadora {

    //Método que suma dos enteros
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    //Método que resta dos enteros
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    //Método que multiplica dos enteros
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    //Método que divide dos numeros con decimales
    public double dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("ERROR. No se puede dividir el número por cero");
        }
        return (double) num1 / num2;
    }


}

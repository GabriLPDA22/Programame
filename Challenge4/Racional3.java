package Challenge4;

public class Racional3 {
    private int numerador;
    private int denominador;

    // Constructor para un entero
    public Racional3(int numerador) {
        this(numerador, 1);
    }

    // Constructor principal
    public Racional3(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    // Simplifica la fracción
    private void simplificar() {
        int mcd = mcd(this.numerador, this.denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
    }

    // Calcula el MCD
    private int mcd(int a, int b) {
        return b == 0 ? a : mcd(b, a % b);
    }

    // Suma dos fracciones
    public Racional3 sumar(Racional3 otro) {
        int nuevoNumerador = this.numerador * otro.denominador + otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional3(nuevoNumerador, nuevoDenominador);
    }

    // Resta dos fracciones
    public Racional3 restar(Racional3 otro) {
        int nuevoNumerador = this.numerador * otro.denominador - otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional3(nuevoNumerador, nuevoDenominador);
    }

    // Multiplica dos fracciones
    public Racional3 multiplicar(Racional3 otro) {
        int nuevoNumerador = this.numerador * otro.numerador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional3(nuevoNumerador, nuevoDenominador);
    }

    // Divide dos fracciones
    public Racional3 dividir(Racional3 otro) {
        if (otro.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por una fracción con numerador cero.");
        }
        int nuevoNumerador = this.numerador * otro.denominador;
        int nuevoDenominador = this.denominador * otro.numerador;
        return new Racional3(nuevoNumerador, nuevoDenominador);
    }

    // Representa la fracción como una cadena de texto
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Métodos getNumerador y getDenominador   
    public int getNumerador() {
        return numerador;
    }


    public int getDenominador() {
        return denominador;
    }


public static void main(String[] args) {
    Racional3 fraccion1 = new Racional3(1, 2);
    Racional3 fraccion2 = new Racional3(1, 3);

    Racional3 suma = fraccion1.sumar(fraccion2);
    System.out.println("Suma: " + suma);

    Racional3 resta = fraccion1.restar(fraccion2);
    System.out.println("Resta: " + resta);

    Racional3 producto = fraccion1.multiplicar(fraccion2);
    System.out.println("Producto: " + producto);

    Racional3 cociente = fraccion1.dividir(fraccion2);
    System.out.println("Cociente: " + cociente);
}
}
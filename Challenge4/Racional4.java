package Challenge4;

public class Racional4 {
    private int numerador;
    private int denominador;

    // Constructor para crear un Racional a partir de un entero (como un numerador con denominador 1)
    public Racional4(int numerador) {
        this(numerador, 1);
    }

    // Constructor principal que acepta un numerador y un denominador
    public Racional4(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    // Simplifica la fracción utilizando el MCD
    private void simplificar() {
        int mcd = mcd(this.numerador, this.denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
    }

    // Calcula el MCD de dos enteros
    private int mcd(int a, int b) {
        return b == 0 ? a : mcd(b, a % b);
    }

    // Retorna el numerador de la fracción
    public int getNumerador() {
        return this.numerador;
    }

    // Retorna el denominador de la fracción
    public int getDenominador() {
        return this.denominador;
    }

    // Representa la fracción en forma de cadena de texto
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

    // Aquí podrían ir otros métodos como sumar, restar, etc.

    // Método main para probar la clase Racional
    public static void main(String[] args) {
        Racional4 r = new Racional4(3, 5);
        System.out.println("Racional: " + r);
    }
}


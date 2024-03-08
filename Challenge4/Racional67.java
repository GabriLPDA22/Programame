package Challenge4;

public class Racional67 {
    private int numerador;
    private int denominador;

    // Constructor de la clase Racional
    public Racional67(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    // Método para simplificar la fracción
    private void simplificar() {
        int mcd = mcd(this.numerador, this.denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
    }

    // Método para calcular el máximo común divisor (MCD)
    private int mcd(int a, int b) {
        return b == 0 ? a : mcd(b, a % b);
    }

    // Método para sumar este Racional con otro y devolver el resultado
    public Racional67 sumar(Racional67 otro) {
        int nuevoNumerador = this.numerador * otro.denominador + otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional67(nuevoNumerador, nuevoDenominador);
    }

    // Método para restar este Racional con otro y devolver el resultado
    public Racional67 restar(Racional67 otro) {
        int nuevoNumerador = this.numerador * otro.denominador - otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional67(nuevoNumerador, nuevoDenominador);
    }

    // Método para multiplicar este Racional con otro y devolver el resultado
    public Racional67 multiplicar(Racional67 otro) {
        int nuevoNumerador = this.numerador * otro.numerador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional67(nuevoNumerador, nuevoDenominador);
    }

    // Método para dividir este Racional con otro y devolver el resultado
    public Racional67 dividir(Racional67 otro) {
        if (otro.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por un Racional con numerador cero.");
        }
        int nuevoNumerador = this.numerador * otro.denominador;
        int nuevoDenominador = this.denominador * otro.numerador;
        return new Racional67(nuevoNumerador, nuevoDenominador);
    }

    // Método para obtener el numerador
    public int getNumerador() {
        return this.numerador;
    }

    // Método para obtener el denominador
    public int getDenominador() {
        return this.denominador;
    }

    // Método para representar la fracción como una cadena de texto
    @Override
    public String toString() {
        if (denominador == 1) {
            // Si el denominador es 1, se muestra solo el numerador.
            return String.valueOf(numerador);
        } else {
            return numerador + "/" + denominador;
        }
    }

    public static void main(String[] args) {
        // Pruebas de la clase Racional
        Racional67 r1 = new Racional67(1, 2);
        Racional67 r2 = new Racional67(3, 4);

        // Realiza las operaciones
        Racional67 suma = r1.sumar(r2);
        Racional67 resta = r1.restar(r2);
        Racional67 producto = r1.multiplicar(r2);
        Racional67 cociente = r1.dividir(r2);

        // Imprime los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Cociente: " + cociente);
    }
}


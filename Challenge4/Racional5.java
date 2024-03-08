package Challenge4;

public class Racional5 {
    private int numerador;
    private int denominador;

    // Constructor de la clase Racional
    public Racional5(int numerador, int denominador) {
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
    public Racional5 sumar(Racional5 otro) {
        int nuevoNumerador = this.numerador * otro.denominador + otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional5(nuevoNumerador, nuevoDenominador);
    }

    // Método para restar este Racional con otro y devolver el resultado
    public Racional5 restar(Racional5 otro) {
        int nuevoNumerador = this.numerador * otro.denominador - otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional5(nuevoNumerador, nuevoDenominador);
    }

    // Método para multiplicar este Racional con otro y devolver el resultado
    public Racional5 multiplicar(Racional5 otro) {
        int nuevoNumerador = this.numerador * otro.numerador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional5(nuevoNumerador, nuevoDenominador);
    }

    // Método para dividir este Racional con otro y devolver el resultado
    public Racional5 dividir(Racional5 otro) {
        if (otro.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por un Racional con numerador cero.");
        }
        int nuevoNumerador = this.numerador * otro.denominador;
        int nuevoDenominador = this.denominador * otro.numerador;
        return new Racional5(nuevoNumerador, nuevoDenominador);
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
        return this.numerador + "/" + this.denominador;
    }

    // Método principal para probar la clase Racional
    public static void main(String[] args) {
        Racional5 r1 = new Racional5(1, 4);
        Racional5 r2 = new Racional5(1, 2);

        // Probar operaciones
        Racional5 suma = r1.sumar(r2);
        Racional5 resta = r1.restar(r2);
        Racional5 producto = r1.multiplicar(r2);
        Racional5 cociente = r1.dividir(r2);

        // Imprimir resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Cociente: " + cociente);
    }
}


package Challenge4;

public class Racional9 {
    private int numerador;
    private int denominador;

    // Constructor que acepta un solo argumento entero para números racionales que son enteros
    public Racional9(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    // Constructor principal que acepta un numerador y un denominador
    public Racional9(int numerador, int denominador) {
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

    // Calcula el máximo común divisor (MCD)
    private int mcd(int a, int b) {
        return b == 0 ? a : mcd(b, a % b);
    }

    // Método para sumar este Racional con otro y devolver el resultado
    public Racional9 sumar(Racional9 otro) {
        int nuevoNumerador = this.numerador * otro.denominador + otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional9(nuevoNumerador, nuevoDenominador);
    }

    // Método para restar este Racional con otro y devolver el resultado
    public Racional restar(Racional9 otro) {
        int nuevoNumerador = this.numerador * otro.denominador - otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    // Método para multiplicar este Racional con otro y devolver el resultado
    public Racional multiplicar(Racional9 otro) {
        int nuevoNumerador = this.numerador * otro.numerador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    // Método para dividir este Racional con otro y devolver el resultado
    public Racional9 dividir(Racional9 otro) {
        if (otro.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por un Racional con numerador cero.");
        }
        int nuevoNumerador = this.numerador * otro.denominador;
        int nuevoDenominador = this.denominador * otro.numerador;
        return new Racional9(nuevoNumerador, nuevoDenominador);
    }

    // Método para representar la fracción como una cadena de texto
    @Override
    public String toString() {
        if (denominador == 1) {
            // Si el denominador es 1, simplemente mostramos el numerador
            return String.valueOf(numerador);
        } else {
            // De lo contrario, mostramos la fracción como "numerador/denominador"
            return numerador + "/" + denominador;
        }
    }

    // Método principal para probar la clase Racional
    public static void main(String[] args) {
        // Crear un Racional a partir de un entero
        Racional9 racionalDeEntero = new Racional9(-42);

        // Mostrar el Racional creado
        System.out.println("Racional de un entero: " + racionalDeEntero);
    }
}


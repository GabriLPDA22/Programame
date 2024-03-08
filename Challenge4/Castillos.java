package Challenge4;

public class Castillos {
    public static void main(String[] args) {
        Racional castillo = new Racional(3, 5); // Inicializa el objeto con 3/5
        castillo = castillo.restar(new Racional(1, 4)); // (3/5) - (1/4)
        castillo = castillo.sumar(new Racional(1, 10)); // El resultado anterior + (1/10)
        castillo = castillo.multiplicar(new Racional(3, 2)); // El resultado anterior * (3/2)

        Racional divisor = new Racional(2, 6); // Inicializa el objeto con 2/6
        divisor = divisor.restar(new Racional(1, 3)); // (2/6) - (1/3)
        divisor = divisor.restar(new Racional(6, 4)); // El resultado anterior - (6/4)
        divisor = divisor.restar(new Racional(2, 3)); // El resultado anterior - (2/3)
        divisor = divisor.restar(new Racional(1, 6)); // El resultado anterior - (1/6)

        castillo = castillo.dividir(divisor); // El resultado de castillo / resultado de divisor

        System.out.println(castillo); // Imprime el resultado final
    }
}

class Racional {
    private int numerador;
    private int denominador;

    // Constructor que acepta un numerador y un denominador
    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    // Método para simplificar la fracción
    private void simplificar() {
        int gcd = mcd(this.numerador, this.denominador);
        this.numerador = this.numerador / gcd;
        this.denominador = this.denominador / gcd;
    }

    // Método para calcular el máximo común divisor (MCD)
    private int mcd(int numerador, int denominador) {
        return denominador == 0 ? numerador : mcd(denominador, numerador % denominador);
    }

    // Método para sumar fracciones
    public Racional sumar(Racional otro) {
        int nuevoNumerador = this.numerador * otro.denominador + this.denominador * otro.numerador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    // Método para restar fracciones
    public Racional restar(Racional otro) {
        int nuevoNumerador = this.numerador * otro.denominador - this.denominador * otro.numerador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    // Método para multiplicar fracciones
    public Racional multiplicar(Racional otro) {
        int nuevoNumerador = this.numerador * otro.numerador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    // Método para dividir fracciones
    public Racional dividir(Racional otro) {
        if (otro.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por una fracción cuyo numerador es cero.");
        }
        int nuevoNumerador = this.numerador * otro.denominador;
        int nuevoDenominador = this.denominador * otro.numerador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    // Representación en cadena de la fracción
    @Override
    public String toString() {
        if (denominador == 1) {
            return String.valueOf(numerador); // Si el denominador es 1, solo se muestra el numerador
        } else {
            return numerador + "/" + denominador; // De lo contrario, se muestra la fracción completa
        }
    }
}




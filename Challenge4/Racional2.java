package Challenge4;

public class Racional2 {
    
    private int numerador;
    private int denominador;

    // Constructor de la clase Racional
    public Racional2(int numerador, int denominador) {
        this.numerador = numerador;
        // Asegúrese de que el denominador no sea cero
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.denominador = denominador;
        simplificar();
    }

    // Método para simplificar fracciones
    private void simplificar() {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    // Método para calcular el máximo común divisor
    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    // Método para sumar fracciones
    public Racional2 sumar(Racional2 otro) {
        int nuevoNumerador = this.numerador * otro.denominador + otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional2(nuevoNumerador, nuevoDenominador);
    }

    // Sobrecarga de toString para imprimir la fracción
    @Override
    public String toString() {
        return numerador + " / " + denominador;
    }

    
    // Método principal para probar la clase Racional
    public static void main(String[] args) {
        // Crear fracciones
        Racional2 r1 = new Racional2(1, 4);
        Racional2 r2 = new Racional2(2, 6);

        // Sumar fracciones
        Racional2 resultado = r1.sumar(r2);

        // Imprimir resultado
        System.out.println(resultado);
    }
}

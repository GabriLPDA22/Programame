package Challenge4;

public class Racional1 {
     // Método para encontrar el máximo común divisor, útil para simplificar fracciones
     public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }
    
    // Método para simplificar fracciones
    public static int[] simplificar(int numerador, int denominador) {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
        return new int[] { numerador, denominador };
    }

    // Método para sumar fracciones
    public static int[] sumar(int num1, int den1, int num2, int den2) {
        int numerador = num1 * den2 + num2 * den1;
        int denominador = den1 * den2;
        return simplificar(numerador, denominador);
    }

    // Método para restar fracciones
    public static int[] restar(int num1, int den1, int num2, int den2) {
        int numerador = num1 * den2 - num2 * den1;
        int denominador = den1 * den2;
        return simplificar(numerador, denominador);
    }

    // Método para multiplicar fracciones
    public static int[] multiplicar(int num1, int den1, int num2, int den2) {
        int numerador = num1 * num2;
        int denominador = den1 * den2;
        return simplificar(numerador, denominador);
    }

    // Método para dividir fracciones
    public static int[] dividir(int num1, int den1, int num2, int den2) {
        int numerador = num1 * den2;
        int denominador = den1 * num2;
        return simplificar(numerador, denominador);
    }

    // Método principal para probar las operaciones con fracciones
    public static void main(String[] args) {
        // Ejemplo de suma de fracciones
        int[] resultadoSuma = sumar(1, 2, 3, 4); // 1/2 + 3/4
        System.out.println("Suma: " + resultadoSuma[0] + "/" + resultadoSuma[1]);

        // Ejemplo de resta de fracciones
        int[] resultadoResta = restar(3, 4, 1, 2); // 3/4 - 1/2
        System.out.println("Resta: " + resultadoResta[0] + "/" + resultadoResta[1]);

        // Ejemplo de multiplicación de fracciones
        int[] resultadoMultiplicacion = multiplicar(1, 2, 3, 4); // 1/2 * 3/4
        System.out.println("Multiplicación: " + resultadoMultiplicacion[0] + "/" + resultadoMultiplicacion[1]);

        // Ejemplo de división de fracciones
        int[] resultadoDivision = dividir(1, 2, 3, 4); // 1/2 ÷ 3/4
        System.out.println("División: " + resultadoDivision[0] + "/" + resultadoDivision[1]);
    }
}

package Sala_Cine;

import java.util.Random;

public class Sala{
        
    private Asiento[][] asientos;
    private final int FILAS = 8;
    private final int COLUMNAS = 9;

    
    public Sala(){
        asientos = new Asiento[FILAS][COLUMNAS];
        inicializarAsientos();
    } 
    

    private void inicializarAsientos() {
        for (int x = 0; x < FILAS; x++) {
            for (int y = 0; y < COLUMNAS; y++) {
                // Nota que la fila 1 comienza al final de la matriz
                asientos[x][y] = new Asiento((char)('A' + y), FILAS - x);

            }
        }
    }

    public boolean sentar(Espectador espectador, Pelicula pelicula) {
        if (espectador.getDinero() < pelicula.getPrecioEntrada() || espectador.getEdad() < pelicula.getEdadMinima()) {
            return false;
        }

        Random rand = new Random();
        int intentos = FILAS * COLUMNAS;

        while (intentos > 0) {
            int fila = rand.nextInt(FILAS);
            int col = rand.nextInt(COLUMNAS);

            if (!asientos[fila][col].isOcupado()) {
                asientos[fila][col].ocupar();
                System.out.println("Espectador " + espectador.getNombre() + " sentado en asiento " +
                        asientos[fila][col].getFila() + asientos[fila][col].getColumna());
                return true;
            }

            intentos--;
        }

        return false;
    }

    // Método para obtener un asiento específico
    public Asiento getAsiento(char filaLetra, int numero) {
        int fila = numero - 1; // Suponemos que el número 1 corresponde a la primera fila
        int columna = filaLetra - 'A'; // Convierte la letra de la fila en un índice (A -> 0, B -> 1, etc.)
        
        // Verificar que los índices están dentro de los límites de la matriz de asientos
        if (fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS) {
            return asientos[fila][columna];
        } else {
            //  Aqui lanzamos una excepción o devolver null para indicar que el asiento no existe
            throw new IllegalArgumentException("Asiento no válido: " + filaLetra + numero);
        }
    }

    // Método para imprimir el estado de todos los asientos
    public void imprimirEstadoAsientos() {
        for (int x = 0; x < FILAS; x++) {
            for (int y = 0; y < COLUMNAS; y++) {
                Asiento asiento = asientos[x][y];
                System.out.print(asiento.isOcupado() ? "[X]" : "[ ]");
            }
        System.out.println();
    }
    }
}
import java.util.Random;

public class Sala{
        
    private Asiento[][] asientos;
    private final int FILAS = 8;
    private final int COLUMNAS = 9;

    
    public Sala(){
        asientos = new Asiento[FILAS][COLUMNAS];
    } 
    

    public void inicializarAsientos() {
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


     public Asiento getAsiento(char fila, int numero) {
        // Verificar si los índices están dentro de los límites de la matriz.
        if (fila >= 'A' && fila <= 'H' && numero > 0 && numero <= COLUMNAS) {
            // Convertir la letra de la fila a un índice de matriz (por ejemplo, A=0, B=1, etc.).
            int indiceFila = 'H' - fila;

            // Obtener el asiento en la posición especificada.
            return asientos[indiceFila][numero - 1]; // Restamos 1 porque los números de asiento generalmente comienzan desde 1.
        } else {
            // Manejar el caso en que los índices están fuera de los límites.
            System.out.println("Error: asiento no válidos.");
            return null; 
        }
    }

    public void imprimirEstadoAsientos() {
        for (int x = 0; x < FILAS; x++) {
            for (int y = 0; y < COLUMNAS; y++) {
                System.out.print(asientos[x][y].toString() + " "); 
            }
            System.out.println(); 
        }
    }

}
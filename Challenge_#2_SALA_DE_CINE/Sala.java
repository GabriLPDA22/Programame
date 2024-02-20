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


    public void imprimirEstadoAsientos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirEstadoAsientos'");
    }


    public Asiento getAsiento(char c, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAsiento'");
    }


}
public class Asiento {
    private final char columna;
    private final char fila;
    private boolean ocupado;


    // Constructor
    public Asiento(char columna, char fila) {
        this.columna = columna;
        this.fila = fila;
        this.ocupado = false;
    }

    // Getters y métodos para manejar el asiento
    public char getColumna() {
        return columna;
    }

    public char getFila() {
        return fila;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocupar() {
        this.ocupado = true;
    }

    public void desocupar() {
        this.ocupado = false;
    }
}

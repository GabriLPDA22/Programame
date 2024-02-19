public class Cine {
    
    // Atributos de la clase Cine
    private Pelicula peliculaEnReproduccion;
    private double precioEntrada;
    private String Titulo;

    // Constructor
    public Cine(double precioEntrada, Pelicula peliculaEnReproduccion, String Titulo) {
        this.precioEntrada = precioEntrada;
        this.peliculaEnReproduccion = peliculaEnReproduccion; // Corregido el nombre del parámetro
        this.Titulo = Titulo;
    }


    //Getters y setters

    public Pelicula getPeliculaEnReproduccion() {
        return peliculaEnReproduccion;
    }

    public void setPeliculaEnReproduccion(Pelicula peliculaEnReproduccion) {
        this.peliculaEnReproduccion = peliculaEnReproduccion;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}

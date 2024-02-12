public class Cine {
    
    // Atributos de la clase Cine
    private Pelicula peliculaEnReproduccion;
    private double precioEntrada;


    //Constructor
    public Cine(double precioEntrada, Pelicula peliculaEnPelicula ){

        this.precioEntrada = precioEntrada;
        this.peliculaEnReproduccion = peliculaEnReproduccion;
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
}

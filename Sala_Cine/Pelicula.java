package Sala_Cine;

public class Pelicula {
    // Atributos de la clase Pelicula
    private String titulo;
    private int duracion; // Duración en minutos
    private int edadMinima;
    private String director;
    private double precioEntrada; // Nuevo atributo para el precio de la entrada

    // Constructor de la clase Pelicula
    public Pelicula(String titulo, int duracion, int edadMinima, String director, double precioEntrada) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
        this.precioEntrada = precioEntrada; 
    }

    // Geters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //Metodo para poder sacar le precio de la pelicula
    
    public double getPrecioEntrada() {
        return precioEntrada;
    }

    // Setter para el precio de la entrada
    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

}

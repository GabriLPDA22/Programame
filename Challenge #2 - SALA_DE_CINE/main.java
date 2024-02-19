public class main {
    public static void main(String[] args) {
        // Crear una instancia de Pelicula
        Pelicula miPelicula = new Pelicula("Interstellar", 169, 13, "Christopher Nolan");

        // Mostrar los detalles de la película
        System.out.println("Película creada:");
        System.out.println("Título: " + miPelicula.getTitulo());
        System.out.println("Duración: " + miPelicula.getDuracion() + " minutos");
        System.out.println("Edad mínima: " + miPelicula.getEdadMinima() + " años");
        System.out.println("Director: " + miPelicula.getDirector());


        // Crear una instancia de Cine
        Cine miCine = new Cine(8.50, miPelicula, null);

        // Mostrar los detalles del cine
        System.out.println("\nCine:");
        System.out.println("Precio de la entrada: " + miCine.getPrecioEntrada() +" $");
        System.out.println("Película en reproducción: " + miCine.getPeliculaEnReproduccion().getTitulo());

    }
}


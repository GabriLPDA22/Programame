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

        Espectador miEspectador = new Espectador("Adrian", 19, 100);

        // Usando toString() para imprimir la información del espectador
        System.out.println(miEspectador.toString()); // o simplemente System.out.println(miEspectador);


        // Crear la sala de cine con los asientos
        Sala salaDeCine = new Sala();

        // Supongamos que queremos comprobar si un asiento específico está ocupado
        // Por ejemplo, el asiento 5A (sería el asiento [3][0] en la matriz)
        Asiento miAsiento = salaDeCine.getAsiento('A', 5);

        // Comprobar si el asiento está ocupado
        System.out.println("¿Está ocupado el asiento 5A? " + miAsiento.isOcupado());

        // Ahora, vamos a "ocupar" este asiento y volver a comprobar
        miAsiento.ocupar();  // Suponiendo que este método cambia el estado a ocupado
        System.out.println("¿Está ocupado el asiento 5A después de ocuparlo? " + miAsiento.isOcupado());

        // Finalmente, podemos imprimir el estado de todos los asientos
        System.out.println("Estado inicial de todos los asientos:");
        salaDeCine.imprimirEstadoAsientos();

    }
}
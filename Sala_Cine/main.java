package Sala_Cine;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        try {
            // llama a getAsiento
        } catch (UnsupportedOperationException e) {
            // Manejar la excepción, quizás informando al usuario que la acción no está disponible
            System.out.println(e.getMessage());
        }

        // Crear una instancia de Pelicula
        Pelicula miPelicula = new Pelicula("Interstellar", 169, 15, "Christopher Nolan", 8.50);

        // Crear una instancia de Cine
        Cine miCine = new Cine(8.50, miPelicula, null);

        // Mostrar los detalles de la película
        System.out.println("Película creada:");
        System.out.println("Título: " + miPelicula.getTitulo());
        System.out.println("Duración: " + miPelicula.getDuracion() + " minutos");
        System.out.println("Edad mínima: " + miPelicula.getEdadMinima() + " años");
        System.out.println("Director: " + miPelicula.getDirector());


        // Mostrar los detalles del cine
        System.out.println("\nCine:");
        System.out.println("Precio de la entrada: " + miCine.getPrecioEntrada() +" $");
        System.out.println("Película en reproducción: " + miCine.getPeliculaEnReproduccion().getTitulo());

        // Crear la sala de cine con los asientos
        Sala salaDeCine = new Sala();
        salaDeCine.inicializarAsientos();
        
        // Arreglo de nombres posibles para los espectadores
        String[] nombres = {"Ana", "Luis", "Carlos", "Sofía", "Marta", "Pedro", "Juan", "Lucía", "Mario", "Elena"};

        // Generador de números aleatorios
        Random random = new Random();

        // Crear y evaluar espectadores
        for (int i = 0; i < 100; i++) {
            // Generar nombre, edad y dinero aleatorios para el espectador
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = 1 + random.nextInt(99); // Edad entre 1 y 99 años
            double dinero = 0.50 + (random.nextDouble() * 99.5); // Dinero entre 0.50 y 100.0

            // Crear el espectador
            Espectador espectador = new Espectador(nombre, edad, dinero);

            // Verificar si tiene suficiente dinero
            if (espectador.getDinero() < miPelicula.getPrecioEntrada()) {
                System.out.println(espectador.getNombre() + " no pudo ser sentado por falta de dinero.");
                continue; // Saltar al siguiente espectador
            }

            // Verificar si cumple con la edad mínima
            if (espectador.getEdad() < miPelicula.getEdadMinima()) {
                System.out.println(espectador.getNombre() + " no pudo ser sentado por no cumplir con la edad mínima.");
                continue; // Saltar al siguiente espectador
            }

            // Intentar sentar al espectador
            boolean sentado = salaDeCine.intentarSentar(espectador, miPelicula);
            if (sentado) {
                System.out.println(espectador.getNombre() + " ha sido sentado.");
            } else {
                System.out.println(espectador.getNombre() + " no pudo ser sentado.");
            }
        }

          // HEMOS QUITADO EL TRY CATCH PORQUE LO EMOS PODIDO HACER DE OTRA MANERA

          // Trabajar con un asiento específico
          /*try {
              Asiento miAsiento = salaDeCine.getAsiento('A', 5);
              // Comprobar si el asiento está ocupado y ocuparlo si no lo está
              // ...
          } catch (IllegalArgumentException e) {
              System.out.println("Se ha intentado acceder a un asiento no válido: " + e.getMessage());
          } catch (UnsupportedOperationException e) {
              // Manejo de la excepción si es necesario
          }*/
  
          // Imprimir el estado de todos los asientos
          salaDeCine.imprimirEstadoAsientos();
      }
}
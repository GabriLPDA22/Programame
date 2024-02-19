public class Main {

    public static void main(String[] args) {
        
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

public class main
{
    public static void main(String[] args) 
    {
        Espectador miEspectador = new Espectador("Adrian", 19, 100);    

        System.out.println("Nombre " + miEspectador.getNombre());
        System.out.println("Dinero " + miEspectador.getDinero());
        System.out.println("Edad " + miEspectador.getEdad());
    }
}
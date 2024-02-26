package Sala_Cine;


public class Espectador {
    
    String nombre;
    int edad;
    double dinero;
    private Asiento asiento;

    public Espectador(String nombre, int edad, double dinero, Asiento asiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.asiento = asiento;
    }

    public double getDinero()
    {
        return dinero;
    }

    public void setDinero(double dinero)
    {
        this.dinero = dinero;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public Asiento getAsiento() {
        return this.asiento;
    }

    // Sobrescribiendo el método toString()
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Dinero: " + dinero;
    }


}
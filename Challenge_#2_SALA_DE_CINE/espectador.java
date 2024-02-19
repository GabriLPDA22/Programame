class Espectador {
    String nombre;
    int edad;
    double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
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

    // Sobrescribiendo el método toString()
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Dinero: " + dinero;
    }
}
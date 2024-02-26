package Eelectrodomesticos_Reto;

public class Lavadora extends Electrodomesticos {
    // Atributo
    private double carga;
    
    // Constante
    private final static double CARGA_DEFECTO = 5;
    
    // Constructor por defecto
    public Lavadora(){
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, CARGA_DEFECTO);
    }
    
    // Constructor con precio y peso
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, CARGA_DEFECTO);
    }
    
    // Constructor con todos los atributos
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, double carga){
        super(precioBase, peso, consumoEnergetico, color);
        this.carga = carga;
    }
    
    // Método get de carga
    public double getCarga() {
        return carga;
    }
    
    // Método precioFinal (sobrescrito)
    @Override
    public double precioFinal(){
        double incremento = super.precioFinal();
        if(carga > 30) incremento += 50;
        return incremento;
    }
}
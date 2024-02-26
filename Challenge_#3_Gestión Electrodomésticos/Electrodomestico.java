public class Electrodomestico {
    // Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    // Constantes
    private final static String COLOR_DEFECTO = "blanco";
    private final static char CONSUMO_ENERGETICO_DEFECTO = 'F';
    private final static double PRECIO_BASE_DEFECTO = 100;
    private final static double PESO_DEFECTO = 5;
    
    // Constructor por defecto
    public Electrodomestico(){
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO);
    }
    
    // Constructor con precio y peso
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO);
    }
    
    // Constructor con todos los atributos
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.color = comprobarColor(color);
    }
    
    // Métodos get
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    // Comprobar consumo energético
    private char comprobarConsumoEnergetico(char letra){
        if(letra >= 'A' && letra <= 'F'){
            return letra;
        }else{
            return CONSUMO_ENERGETICO_DEFECTO;
        }
    }
    
    // Comprobar color
    private String comprobarColor(String color){
        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        for(String c: coloresValidos){
            if(c.equalsIgnoreCase(color)){
                return color;
            }
        }
        return COLOR_DEFECTO;
    }
    
    // Método precioFinal
    public double precioFinal(){
        double incremento = 0;
        
        switch(consumoEnergetico){
            case 'A': incremento += 100; break;
            case 'B': incremento += 80; break;
            case 'C': incremento += 60; break;
            case 'D': incremento += 50; break;
            case 'E': incremento += 30; break;
            case 'F': incremento += 10; break;
        }
        
        if(peso >= 0 && peso < 20) incremento += 10;
        else if(peso >= 20 && peso < 50) incremento += 50;
        else if(peso >= 50 && peso < 80) incremento += 80;
        else if(peso >= 80) incremento += 100;
        
        return precioBase + incremento;
    }
}

package
Eelectrodomesticos_Reto;
public class Television extends Electrodomesticos {
    // Atributos
    private double resolucion;
    private boolean sintonizadorTDT;
    
    // Constantes
    private final static double RESOLUCION_DEFECTO = 20;
    private final static boolean SINTONIZADOR_TDT_DEFECTO = false;
    
    // Constructor por defecto
    public Television(){
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, RESOLUCION_DEFECTO, SINTONIZADOR_TDT_DEFECTO);
    }
    
    // Constructor con precio y peso
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, RESOLUCION_DEFECTO, SINTONIZADOR_TDT_DEFECTO);
    }
    
    // Constructor con todos los atributos
    public Television(double precioBase, double peso, char consumoEnergetico, String color, double resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    // Métodos get
    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    
    // Método precioFinal (sobrescrito)
    @Override
    public double precioFinal(){
        double incremento = super.precioFinal();
        if(resolucion > 40) incremento *= 1.3;
        if(sintonizadorTDT) incremento += 50;
        return incremento;
    }
}
package Eelectrodomesticos_Reto;


public class main {
    public static void main(String[] args) {
        Electrodomesticos[] electrodomesticos = new Electrodomesticos[10];
        
        // Asignar objetos a cada posición del array
        electrodomesticos[0] = new Electrodomesticos();
        electrodomesticos[1] = new Lavadora(200, 30, 'A', "negro", 40);
        electrodomesticos[2] = new Television(500, 20, 'B', "rojo", 55, true);
        
        double precioElectrodomesticos = 0;
        double precioLavadoras = 0;
        double precioTelevisiones = 0;
        
        // Recorrer el array y calcular precios
        for(Electrodomesticos e : electrodomesticos){
            if(e != null){
                double precio = e.precioFinal();
                System.out.println("Precio final: " + precio + "€");
                precioElectrodomesticos += precio;
                
                if(e instanceof Lavadora){
                    precioLavadoras += precio;
                } else if(e instanceof Television){
                    precioTelevisiones += precio;
                }
            }
        }
        
        // Mostrar precios por categoría
        System.out.println("Precio total Electrodomésticos: " + precioElectrodomesticos + " €");
        System.out.println("Precio total Lavadoras: " + precioLavadoras + " €");
        System.out.println("Precio total Televisiones: " + precioTelevisiones + " €");
    }
}
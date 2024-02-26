# Sistema de Gestión de Electrodomésticos 💡🔌

## Descripción General
Este proyecto simula un sistema de gestión de electrodomésticos, incluyendo lavadoras y televisiones, utilizando los principios de la programación orientada a objetos, como la herencia y el polimorfismo. Se calcula el precio final de cada electrodoméstico basado en sus características específicas.

## Clases

### `Electrodomestico`
- **Atributos:** precio base, color, consumo energético (A-F), peso.
- **Constructores:**
  - Por defecto.
  - Con precio y peso.
  - Todos los atributos.
- **Métodos:** Getters, `comprobarConsumoEnergetico(char)`, `comprobarColor(String)`, `precioFinal()`.
  
### `Lavadora` (Hereda de `Electrodomestico`)
- **Atributo adicional:** carga (kg).
- **Constructores:**
  - Por defecto.
  - Con precio y peso.
  - Con carga y todos los atributos heredados.
- **Método adicional:** `precioFinal()`, incluye lógica para carga mayor de 30 kg.

### `Television` (Hereda de `Electrodomestico`)
- **Atributos adicionales:** resolución (pulgadas), sintonizador TDT (booleano).
- **Constructores:**
  - Por defecto.
  - Con precio y peso.
  - Con resolución, sintonizador TDT y todos los atributos heredados.
- **Métodos adicionales:** `precioFinal()`, incluye lógica para resolución y sintonizador TDT.

## Clase Ejecutable
- **Objetivo:** Crear un array de `Electrodomestico` con 10 posiciones, asignar objetos de `Electrodomestico`, `Lavadora`, y `Television`, y calcular el precio final de cada uno.
- **Pasos:**
  1. Inicializar el array.
  2. Asignar a cada posición un objeto correspondiente.
  3. Recorrer el array, invocar `precioFinal()` para cada objeto.
  4. Mostrar el precio total por tipo de electrodoméstico.

## Ejecución del Proyecto 🚀
Detalla cómo compilar y ejecutar el proyecto, incluyendo cualquier requisito de entorno o dependencia necesaria.

## Conclusión 📊
Breve análisis de cómo la herencia y el polimorfismo facilitan la gestión de diferentes tipos de electrodomésticos y la flexibilidad para extender el sistema con nuevos tipos en el futuro.


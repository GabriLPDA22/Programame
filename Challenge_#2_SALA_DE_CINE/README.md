# Sistema de Gestión de Cine

Este programa simula la gestión de una sala de cine, controlando la asignación de asientos a los espectadores, la información de las películas en cartelera, y el manejo de los espectadores.

## Características

- **Gestión de Películas**: Permite registrar películas con detalles como título, duración, edad mínima y director.
- **Gestión de Espectadores**: Maneja la información de los espectadores, incluyendo su nombre, edad y dinero disponible.
- **Gestión de Asientos**: Controla los asientos de una sala de cine que consta de 8 filas por 9 columnas.
- **Asignación de Asientos**: Asigna asientos a los espectadores de manera aleatoria, teniendo en cuenta la disponibilidad, el presupuesto del espectador y las restricciones de edad.

## Estructura del Proyecto

El proyecto consta de las siguientes clases Java:

- `Asiento.java`: Define los atributos de los asientos en el cine.
- `Cine.java`: Contiene la información del cine, como la película actual y el precio de la entrada.
- `Espectador.java`: Modela a un espectador con su nombre, edad y dinero.
- `Pelicula.java`: Almacena los detalles de las películas disponibles en el cine.
- `Sala.java`: Encapsula la estructura y la gestión de los asientos de la sala de cine.
- `main.java`: Contiene el método `main` para ejecutar la simulación.

## Cómo Ejecutar

1. Asegúrate de tener [Java](https://www.java.com/es/download/) instalado en tu sistema.
2. Descarga los archivos del proyecto a tu directorio local.
3. Abre una terminal y navega al directorio donde guardaste los archivos.
4. Compila el proyecto con el comando `javac NombreDelArchivo.java`.
5. Ejecuta el programa con el comando `java NombreDeLaClasePrincipal`.

## Ejemplo de Uso

Describe cómo se utiliza el programa, puedes incluir algunos ejemplos de comandos de entrada y la salida esperada.

## Contribuir

Si deseas contribuir al proyecto, por favor envía un pull request o abre un issue para discutir los cambios propuestos.


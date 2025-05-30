EventeMasterPro Medellín

**EventeMasterPro Medellín** 

Es una aplicación de consola desarrollada en Java para la administración integral de eventos culturales y musicales. El sistema permite gestionar artistas, recintos, entradas, accesos, finanzas y estadísticas de manera centralizada.


## Funcionalidades principales ##

- Crear y listar eventos
- Gestionar recintos con fechas y especificaciones técnicas
- Registrar y visualizar artistas con requerimientos técnicos
- Crear y vender entradas para eventos
- Controlar el acceso de asistentes mediante validación
- Registrar ingresos y egresos financieros por evento
- Generar estadísticas de asistencia


## Estructura del Proyecto ##

El sistema está construido bajo un enfoque de programación orientada a objetos (POO), con las siguientes clases:

- `EventeMasterProMedellin` – Clase principal con el menú de navegación del sistema
- `Event` – Define eventos con fecha, hora, artista y lugar
- `Artist` – Representa artistas con su historial y requerimientos
- `Venue` – Modela los recintos disponibles con su capacidad y características
- `Ticket` – Maneja la emisión, estado de venta y validación de entradas
- `AccessControl` – Registra y valida el ingreso de asistentes al evento
- `FinancialRecord` – Controla ingresos, egresos y balance financiero por evento


## Tecnologías utilizadas ##

- Java 8 o superior
- Apache NetBeans IDE
- Librerías estándar de Java (`java.util`, `java.time`, etc.)


## Requisitos ##

- JDK 8 o superior
- NetBeans o cualquier IDE compatible con Java
- Consola para entrada y salida de datos


## Créditos ##

Este proyecto fue desarrollado como parte de un ejercicio académico y tiene como objetivo fortalecer habilidades en diseño orientado a objetos, modularidad y desarrollo de aplicaciones de consola.


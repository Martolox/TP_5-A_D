# TP 6 - Adapter, Decorator y Builder

### Adapter
- Convierte la interfaz de una clase en otra interfaz que es la que esperan los clientes. Permite que cooperen clases que de otra forma no podrían por tener interfaces incompatibles.

### Decorator
- Permite agregar funcionalidad a un objeto de forma dinámica.

### Builder
- Separa la construcción de un objeto complejo de su representación, de forma que el mismo proceso de construcción pueda crear diferentes representaciones.

## 1. Adapter: Motores
Un sistema trabaja con diferentes tipos de motores (Común, Económico) con funciones arrancar, acelerar y apagar. Se desea incorporar un motor eléctrico con operaciones como conectar y activar, moverMasRapido, detener y desconectar.  
  
![TP 6.1](/images/TP6.1.png)

## 2. Adapter: Canvas
Dado el ejemplo del Canvas, se crea una interfaz “Panel” que ofrezca para pintar circulo, linea y texto. Luego se adapta a Graphics2D, de modo que se quita la dependencia de las figuras sobre Graphics2D.  
  
![TP 6.2](/images/TP6.2.png)  

![IMG 6.2](/images/IMG6.2.png)

## 3. Decorator: Reporte
Dado el código, reescribir la funcionalidad de Reporte, de modo tal que:
- exporte sin verificar si el archivo existe (o sea, lo sobreescriba).
- no permita sobrescribir el archivo.  
  
![TP 6.3](/images/TP6.3.png)  

## 4. Decorator, Builder: Combos
Un restaurante de comidas rápidas ofrece 3 tipos de combos (Combo Básico, Combo Familiar, Combo Especial), con adicionales (Tomate, Papas, Carne, Queso).  
Se implementa el patrón Decorator, y luego el Builder para crear los objetos.  
  
![TP 6.4](/images/TP6.4.png)

## 5. Decorator: Sistema de Concursos (TP 2)
Se reimplementa el email que se envía cada vez que un participante se inscribe en un concurso, ahora con decorador.
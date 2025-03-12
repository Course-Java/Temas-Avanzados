public class ClaseAbstracta {
    public static void main(String[] args) {
//        FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); / Error: No se puede instanciar
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

// Clase abstracta
abstract class FiguraGeometrica { // No se puede instanciar
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Dibujando rectangulo");
    }
}

class Circulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
    }
}

/*
 * NOTAS:
 * Cuando hablamos de clases abstractas, nos referimos a esas que dejan sin implementar alguno de sus metodos, para que las clases hijas proporcione la implementación
 * Para definir una clase abstracta, usaremos la palabra reservada abstract class
 * Y para definir el metodo no implementado de la clase abstracta, usaremos (tipo de restricción) abstract (tipo de dato a retornar) nombre
 * No se pueden crear o instanciar objetos desde una clase abstracta
 * Una clase hija podrá heredar de su clase padre abstracta, siempre y cuando utilice el metodo abstracto del padre
 * Recordar una clase padre puede apuntar a sus clases hijas, por eso es que, en nuestro caso, FiguraGeometrica puede apuntar o ser igual tanto a Rectángulo cómo Círculo (porque estas clases heredan de su clase padre, que son el mismo tipo pues)
 */
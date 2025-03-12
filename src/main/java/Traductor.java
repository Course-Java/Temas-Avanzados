public interface Traductor {
    // public y abstract
    void traducir();

    // Metodos con implementación por default
    default void iniciarTraductor() {
        System.out.println("Iniciando Traductor...");
    }
}

class Ingles implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traduciendo Ingles");
    }
}

class Frances implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traduciendo Frances");
    }

    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando traductor en Frances...");
    }
}

class PruebaTraductor {
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}

/*
 * NOTAS:
 * Los metodos definidos en una interface, por default, son public y abstract
 * También podemos agregar una implementación por default a los metodos
 * Las clases que usan interfaces, no se dice que "heredan" de esta interface, sino que se dice que implementan esta interface
 * Al implementar de una interface, nos obligamos a agregar la implementación de los metodos definidos en la interface
 * Por eso se dice que es más cómo un contrato que debemos cumplir
 * Debemos de implementar toda a funcionalidad definida en una interface
 * No podemos crear objetos desde una interface
 * Los metodos no definidos cómo public y abstract (en este caso lo definimos cómo default). Las clases hijas no están obligadas a llamarlos o implementarlas
 */
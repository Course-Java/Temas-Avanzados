import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();

        persona.put("nombre", "Diego");
        persona.put("apellido", "Miguel");
        persona.put("edad", "31");

        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        persona.put("edad", "35"); // Modificar el valor de la llave existente

        persona.remove("apellido");

        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave, valor)");
        persona.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}

/*
 * NOTAS:
 * Los tipos de datos que se puede almacenar, ya sea cómo llave o valor, pueden ser cualquiera
 * No se permiten duplicados
 */
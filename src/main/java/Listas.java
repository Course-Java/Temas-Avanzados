import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista  = new ArrayList<String>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
//        miLista.add(1); -> Error

//        for (String elemento : miLista) {
//            System.out.println("Dia de la semana: " + elemento);
//        }

        // Funciones lambda (función anónima de un código muy compacto)
//        miLista.forEach( elemento -> System.out.println("Dia de la semana: " + elemento));

        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Pedro", "Ivonne", "Nohemi");
        System.out.println("\nLista de Nombres: ");
        nombres.forEach(System.out::println);
    }
}

/*
 * NOTAS:
 * Las colecciones representan un grupo de objetos. Algunas colecciones permiten elementos duplicados y otras no, algunos tienen sus elementos ordenados y otras no
 * Collection sería la interface padre de las colecciones a estudiar (interfaces hijas) (en este caso List)
 * Las interfaces también manejan la herencia entre sus propios tipos
 * Sus interfaces hijas vendrían a ser List (permiten elementos duplicados y manejan un orden respetando el orden en el que se van agregando los elementos) (Una clase que implementa de esta interface es ArrayList por ejemplo) y Set (no permiten elementos duplicados y no manejan un ordenamiento) (Una clase que implementa de esta interface es SortedSet por ejemplo)
 * Por otro lado, se tiene a la interface Map y una clase que implementa de esta interface es HashMap
 * Un Map es cómo un diccionario en la cual la información se almacena con la sintaxis llave (una forma definida para acceder a su información) - valor (valor asociado a esa llave)
 * En este caso estamos definiendo una List, sin embargo, no estamos específicando el tipo de dato que va ha almacenar (Por eso es que al intentar recorrer la lista en un foreach, optamos por almacenar el valor en una clase genérico Object (padre de todos los objetos))
 * Usando la sintaxis 'List<(tipo de dato)> nombre de la lista' específicamos el tipo de dato que queremos almacenar en nuestra lista
 * Por otro lado, también podemos específicar en el Arraylist que tipo de dato vamos a almacenar usando la sintaxis: 'new ArrayList<(tipo de dato)()>'
 * Pero si en la parte de List ya se especificó qué tipo de dato va a usarse, no es necesario aplicar la misma sintaxis en ArrayList (Sin embargo, tenemos que colocar los <> para poder soportar el tipo de List que se está instanciando)
 * El uso de funciones lambda se le conoce cómo programación funcional
 * Las sintaxis de una función lambda es: parámetro a usar -> {código / expresión que hace uso del parámetro}
 */
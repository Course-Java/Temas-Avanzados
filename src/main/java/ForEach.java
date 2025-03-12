public class ForEach {

    public static void main(String[] args) {
        int edades[] = {5, 10, 30, 45};

        // foreach
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
    }
}

/*
 * NOTAS:
 * Otra forma de recorrer un arreglo es usando el bucle llamado foreach (por cada elemento)
 * Sintaxis: for (int edad : edades) -> Donde edad vendría ser la variable donde se almacene cada dato actual del arreglo que está siendo recorrido. "edades" es el arreglo a recorrer.
 * O sea edad, su valor, va a ir cambiando en cada ciclo del recorrido del arreglo.
 * Una desventaja del foreach es que ya no se trabajarían con índices
 */
public class ArgumentosVariables {
    public static void main(String[] args) {
//        imprimirNumeros(1);
        variosParametros("Karla", 10, 20, 30);
    }

    static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}

/*
 * NOTAS:
 * Nosotros estamos acostumbrados a una cantidad inmutable de argumentos en las funciones. Pero hay una forma de hacer que esta cantidad sea variable, que se puedan ingresar tanto 1 o más argumentos cómo quisiéramos.
 * Para eso usaremos la sintaxis: '(tipo de dato)... nombre del argumento'
 * Recordar que esto está limitado a una solo tipo de dato (o sea si colocas int cómo tipo de dato, solo podrás ingresar una cantidad variable de ints)
 * Pero si deseas colocar otros tipos de datos cómo argumentos, puedes hacerlo siempre y cuando dejes cómo último parámetro al argumento variable.
 */
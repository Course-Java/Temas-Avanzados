public class Excepciones {
    public static void main(String[] args) {
        int valor1 = 10, valor2 = 0;
        try {
            var resultado = valor1 / valor2;
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e);
        }
    }
}

/*
 * NOTAS:
 * Tenemos dos tipos de errores: Errores en tiempo de compilación (cómo olvidar un ;) y Excepciones en tiempo de ejecución (cuando se divide en 0 cómo en nuestro caso)
 * Los errores del segundo tipo mayormente terminan en exit code 1 deteniendo abruptamente la ejecución
 * La clase Exception es la clase padre de todas las excepciones (Asi que es común procesar las excepciones con este tipo de excepción) (Hay excepciones más específicas (cómo la de ArithmeticException), pero ahora estamos trabajando con una más genérica)
 * Usando try / catch es cómo decir: "Intenta(try) esto y, si no te sale, atrapa(catch) el error y luego vemos"
 * Al usar try / catch vemos que, aunque termine en error, la ejecución termina en exit code 0, dándonos a entender que se está manejando el error
*/
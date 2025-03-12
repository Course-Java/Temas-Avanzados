package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 2);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e);
        }
        finally {
            System.out.println("Se revisó la división entre cero");
        }
    }
}

/*
 * NOTAS:
 * Si una de nuestras funciones podrían lanzar un error tipo Exception, lo que las manejen (cómo en este caso) si o si lo tienen que hacer mediante un try / catch
 * Sin embargo, si una de nuestras funciones podrían lanzar un error tipo RuntimeException, no es necesario que se use un try / catch para su manejo de la excepción (Pero nuestra aplicación si termina abruptamente)
 * El bloque finally es un apartado que siempre se compilará independientemente de si se lanza un error o no
 */
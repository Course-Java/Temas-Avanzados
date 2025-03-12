package excepciones;

public class Aritmetica {
    public static int division(int a, int b) {
        if (a == 0)
            throw new RuntimeException("Division entre cero");
//            throw new Exception("División entre Cero");
        return a / b;
    }
}

/*
 * NOTAS:
 * Al usar throw es cómo si estuviéramos "lanzando" el error
 * Cuando trabajamos con una excepción en tiempo de ejecución, ya no usamos la clase padre Exception sino la clase RunTimeException
 * Pero si queremos si o si usar el tipo Exception, debemos específicar en la firma del metodo que es probable que se lance un error de tipo Exception, añadiéndole throws Exception (No cómo en el caso anterior que si o si iba a lanzar ese error si la condicional era cierta)
 */
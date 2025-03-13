package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";

        try {
            // Leer todas las líneas de archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del Archivo: ");

            // Bucle normal
//            for (String linea : lineas) {
//                System.out.println(linea);
//            }

            // Expresión Lambda
//            lineas.forEach(linea -> System.out.println(linea));

            // Metodo por Referencia
            lineas.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

/*
 * NOTAS:
 * Con Paths.get(nombreArchivo) devolvemos la ruta donde está nuestro archivo con ese nombre
 * Con el metodo readAllLines vamos a leer todas las líneas de ese archivo
 */
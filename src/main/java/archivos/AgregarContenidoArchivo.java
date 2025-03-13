package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;

        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {
            anexar = archivo.exists();

            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "Nuevo\nContenido";

            salida.println(nuevoContenido);

            // Guardamos la información en el archivo
            salida.close();

            System.out.println("Se agregó contenido al archivo");

        } catch (Exception e) {
            System.out.println("Error al escribir al archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

/*
 * NOTAS:
 * Con anexar nos referimos a si damos paso libre a anexar o "agregar nueva información" al contenido del archivo de texto sin llegar a sobreescribirlo (O sea respetar lo que ya está ahí y agregar el nuevo contenido)
 * Claramente si queremos sobreescribir el contenido del archivo, dejamos la variable anexar en false
 */
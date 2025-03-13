package archivos;

import java.io.File; // input - output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe");
            }
            else {
                // Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

/*
 * NOTAS:
 * Podemos generar un nuevo archivo usando el constructor File(nombre_del_archivo) de momento vacío
 * El metodo exist de un archivo nos devuelve un booleano dándonos a entender si existe o no en el disco duro
 * Cómo vemos para poder generar un archivo, primero tenemos que agregarle un nombre, luego, con FileWriter se crea el archivo, pero poder agregarle información al archivo y se guarde en el disco duro, lo colocamos dentro del objeto PrintWriter
 * Cuando el compilador se encuentra con el metodo close(), es ahí recién donde se manda a guardar la información al disco duro
 * Si queremos imprimir cada detalle específico del error, podemos usar printStackTrace(). O sea la traza de cada uno de nuestros errores generados en el programa
 */
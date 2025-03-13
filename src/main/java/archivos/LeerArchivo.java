package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        // Leer el archivo
        var nombreArchivo = "mi_archivo.txt";

        var archivo = new File(nombreArchivo);

        try {
            System.out.println("Contenido del Archivo");

            // Abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));

            // Leemos la primera línea
            var linea = entrada.readLine();

            // Leemos las siguientes líneas
            while (linea != null) {
                System.out.println(linea);

                // Antes de terminar el ciclo, nos movemos a la siguiente línea
                linea = entrada.readLine();
            }

            // Cerrar archivo
            entrada.close();

        }catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

/*
 * NOTAS:
 * La clase BufferedReader nos permite leer líneas completas del archivo
 * Si solo usáramos la clase FileReader, ya no estaríamos leyendo línea por línea, sino caracter por caracter. Es por eso que usamos la clase BufferedReader
 * Con el metodo readLine() ya podemos leer a la primera línea del archivo. Pero, para poder leer todas las líneas, necesitamos un ciclo
 * Es importante que, antes de terminar de leer el archivo, también lo cerremos
 */
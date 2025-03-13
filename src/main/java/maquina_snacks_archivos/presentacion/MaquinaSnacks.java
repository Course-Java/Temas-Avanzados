package maquina_snacks_archivos.presentacion;

import maquina_snacks_archivos.dominio.Snack;
import maquina_snacks_archivos.servicio.IServicioSnacks;
import maquina_snacks_archivos.servicio.ServicioSnacksArchivos;
import maquina_snacks_archivos.servicio.ServicioSnacksLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        var salir = false;
        var consola = new Scanner(System.in);

        // Creamos el objeto para obtener el servicio de snacks (lista)
        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();

        // Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        servicioSnacks.mostrarSnacks(); // Mostrar inventario de snacks disponibles

        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos, servicioSnacks);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            finally {
                System.out.println(); // Imprime un salto de línea con cada iteración
            }
        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo snack
                4. Mostrar Inventario de Snacks
                5. Salir
                Elige una opción:\s""");

        // Leemos y retornamos la opción seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(
            int opcion,
            Scanner consola,
            List<Snack> productos,
            IServicioSnacks servicioSnacks)
    {
        var salir = false;

        switch (opcion) {
            case 1 -> comprarSnack(consola, productos, servicioSnacks);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola, servicioSnacks);
            case 4 -> listarInventarioSnacks(consola, servicioSnacks);
            case 5 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opcion);
        }

        return salir;
    }

    private static void listarInventarioSnacks(
            Scanner consola,
            IServicioSnacks servicioSnacks)
    {
        servicioSnacks.mostrarSnacks();
    }

    private static void comprarSnack(
            Scanner consola,
            List<Snack> productos,
            IServicioSnacks servicioSnacks)
    {

        System.out.print("Que snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());

        // Validar que el snack exista en la lista de snacks
        var snackEncontrado = false;

        for (var snack : servicioSnacks.getSnacks()) {
            if (idSnack == snack.getIdSnack()) {
                // Agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }

        if (!snackEncontrado) {
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos) {
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;

        for (var producto : productos) {
            ticket += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }

        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(
            Scanner consola,
            IServicioSnacks servicioSnacks)
    {
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();

        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());

        servicioSnacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack ha sido agregado correctamente");

        servicioSnacks.mostrarSnacks();
    }
}

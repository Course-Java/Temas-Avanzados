package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks {
    private static final List<Snack> snacks;

    // Bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70.0));
        snacks.add(new Snack("Refresco", 50.0));
        snacks.add(new Snack("Sandwich", 120.0));
    }

    public void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public void mostrarSnacks() {
        var inventarioSnacks = "";

        for (Snack snack : snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }

        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }

    public List<Snack> getSnacks() {
        return snacks;
    }
}

/*
 * NOTAS:
 * Cómo estamos trabajando con atributos y metodos estáticos, no podemos generar un constructor para poder inicializar
 * Sin embargo, podemos inicializar atributos static dentro de un bloque static inicializador con la sintaxis: static {inicializas contenido}
 * Que la lista snacks sea final no significa que su contenido sea inmutable, solo que no se puede reemplazar por otra lista
 */
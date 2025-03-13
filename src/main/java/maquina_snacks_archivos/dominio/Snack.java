package maquina_snacks_archivos.dominio;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnacks = 0;
    private int idSnack;
    private String nombre;
    private double precio;

    public Snack() {
        this.idSnack = ++Snack.contadorSnacks;
    }

    public Snack(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String escribirSnack() {
        return idSnack + "," + nombre + "," + precio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}

/*
 * NOTAS:
 * Los metodos equals() y hashCode() se agregan ya que la lista, de manera interna, va a realizar comparaciones y, para agilizar las búsquedas, ordenamientos u obtención de información de la lista, se recomienda que se agreguen esos metodos.
 * El metodo equals() compara el contenido, comparando cada atributo de nuestra clase
 * El metodo hashCode() genera un valor único usando los valores del objeto
 * El this() de manera automática manda a llamar al constructor vacío (de esta forma cuando se creen los snacks con sus argumentos, también podemos incluir la funcionalidad del ID incrementado colocado en el constructor vacío)
 * El this() debe ser la primera sentencia del otro constructor
 */
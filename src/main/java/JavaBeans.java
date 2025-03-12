import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.setNombre("Karla");
        persona.setApellido("Lara");

        System.out.println("persona = " + persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
    }
}

class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona() {}

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

/*
 * NOTAS:
 * Un JavaBean es una clase de Java que cumple con estas características (seguirá un standard):
 * Debe de tener un constructor vacío, aunque puede tener más constructores (Sobrecarga de constructores) (De manera obligaría debe de tener un constructor público y vacío)
 * Debe de aplicar el concepto de encapsulamiento. O sea atributos privados con sus metodos getters/setters para acceder a ellos
 * Debe implementar un interface Serializable (Permite enviar los objetos por la red o a disco duro)
 * Por eso, cuando usamos frameworks cómo Spring (o cuando publicamos nuestra aplicación en un servidor cómo Tomcat) en ocasiones se nos pide que nuestras clases tengan características de un JavaBean
 * Esta interface nos permite agregar ciertas características de manera automática (características que hacen posible manejarlo/enviarlo por la red o guardar en el disco duro)
 * El constructor vacío de nuestra clase estaría siendo utilizado por frameworks cómo Spring (o cualquier otro que necesite del concepto JavaBean) para crear objetos de manera automática
 * Muchas veces los frameworks no saben qué información se necesita para crear nuestro objeto, por eso utilizan los constructores vacíos de nuestras clases para al menos instanciarlos y, por medio de los metodos get y set, pueda inicializar sus atributos
 * RECORDAR: JavaBeans simplemente es un STANDARD para que se puedan generar objetos sin necesidad de proporcionar más información y de esta forma, poder modificar y leer información de los atributos
 */
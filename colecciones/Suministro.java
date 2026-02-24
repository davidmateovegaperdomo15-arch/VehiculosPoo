package colecciones;

import java.util.Objects;

/**
 * COMPARABLE: Permite que la colección sepa cuál es el "orden natural".
 */
public class Suministro implements Comparable<Suministro> {
    private String nombre;
    private int cantidad;
    private double precio;

    public Suministro(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Orden natural por nombre (Alfabético)
    @Override
    public int compareTo(Suministro otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    // EQUALS & HASHCODE: Vital para que HashSet y HashMap detecten duplicados.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Suministro that)) return false;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return String.format("%s (Cant: %d, $%.2f)", nombre, cantidad, precio);
    }

    // Getters para el Comparator
    public double getPrecio() { return precio; }
}

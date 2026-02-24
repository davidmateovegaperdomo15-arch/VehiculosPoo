/**
 * ABSTRACCIÓN: Definimos un contrato base. No puedes instanciar un "Vehiculo".
 * HERENCIA: Servirá como clase padre para todas las naves.
 */

package OOPbasics;
public abstract class Vehiculo {
    // ENCAPSULAMIENTO (Protected): Permite que las subclases accedan, pero no el mundo exterior.
    protected String modelo;
    private double integridadCasco; // Private: Solo accesible mediante getters/setters (Encapsulamiento estricto)

    public Vehiculo(String modelo) {
        this.modelo = modelo;
        this.integridadCasco = 100.0;
    }

    // Método Abstracto: Obligamos a las subclases a definir SU propia forma de moverse.
    public abstract void iniciarMotor();

    // Getter con lógica: Encapsulamiento en acción para proteger el dato.
    public double getIntegridad() {
        return integridadCasco;
    }
}
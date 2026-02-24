/**
 * ABSTRACCIÓN PURA: Una interfaz no guarda estado (variables de instancia),
 * solo define comportamientos obligatorios.
 * * ¿Por qué usarla? Porque permite que clases que no están emparentadas 
 * (ej. una Nave y una Estación Espacial) compartan las mismas capacidades de defensa.
 */

package OOPbasics;
public interface SistemaDefensa {
    
    // Todos los métodos en una interfaz son implícitamente public y abstract.
    void activarEscudos();
    
    void realizarManiobraEvasiva();

    // Método por defecto (Java 8+): Permite dar una funcionalidad base 
    // sin romper las clases que ya implementan la interfaz.
    default void autodiagnostico() {
        System.out.println("Sistemas de defensa: Estado Óptimo.");
    }
}
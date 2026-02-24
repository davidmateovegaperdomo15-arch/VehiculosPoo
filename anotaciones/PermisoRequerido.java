package anotaciones;
import java.lang.annotation.*;

/**
 * PERMISO REQUERIDO: Anotación para métodos.
 * Demuestra el uso de arrays en atributos de anotación.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PermisoRequerido {
    String[] roles(); // No tiene default, así que es obligatorio ponerlo.
}

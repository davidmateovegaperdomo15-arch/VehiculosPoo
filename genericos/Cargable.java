package genericos;

/**
 * INTERFAZ GENÉRICA: Define un comportamiento para cualquier tipo T.
 */
interface Cargable<T> {
    void cargar(T item);
    T descargar();
}

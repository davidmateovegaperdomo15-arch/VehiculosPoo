package genericos;

/**
 * CLASE GENÉRICA MÚLTIPLE: Usa T (Type) y U (Unit/Utility).
 */
public class ContenedorUniversal<T, U> implements Cargable<T> {
    private T contenido;
    private U etiqueta;

    public ContenedorUniversal(U etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public void cargar(T item) {
        this.contenido = item;
        System.out.println("Cargado [" + item + "] en contenedor: " + etiqueta);
    }

    @Override
    public T descargar() {
        return contenido;
    }
}

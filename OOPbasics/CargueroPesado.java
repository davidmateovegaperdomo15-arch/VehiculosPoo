/**
 * HERENCIA: Hereda de NaveEspacial (que a su vez hereda de Vehiculo e implementa SistemaDefensa).
 * POLIMORFISMO: Redefinimos los métodos para un comportamiento de "tanque" o transporte.
 */

package OOPbasics;
public class CargueroPesado extends NaveEspacial {
    private int capacidadCarga;

    public CargueroPesado(String modelo, int capacidadCarga) {
        super(modelo);
        this.capacidadCarga = capacidadCarga;
    }
    public CargueroPesado(String modelo) {
        super(modelo);
        this.capacidadCarga = 1000; // Valor por defecto de capacidad de carga
    }

    // POLIMORFISMO DE SOBRESCRITURA: Un carguero no inicia motor igual que un caza.
    @Override
    public void iniciarMotor() {
        System.out.println("Calentando calderas de fusión pesada para mover " + capacidadCarga + " toneladas.");
    }

    // POLIMORFISMO: Los escudos de un carguero son masivos.
    @Override
    public void activarEscudos() {
        System.out.println("Generando burbuja deflectora de alta densidad en el carguero " + modelo);
    }
}
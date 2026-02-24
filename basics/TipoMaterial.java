package basics;

/**
 * ENUMS: Demuestra el manejo de tipos constantes y legibilidad.
 */
public enum TipoMaterial {
    HIERRO(500), ACERO(1200), TITANIO(2500), BESKAR(10000);

    private final int puntoFusion;

    TipoMaterial(int puntoFusion) {
        this.puntoFusion = puntoFusion;
    }

    public int getPuntoFusion() {
        return puntoFusion;
    }
}
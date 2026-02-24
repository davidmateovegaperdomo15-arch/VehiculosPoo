package anotaciones;

@SeguridadNave(nivel = NivelAcceso.CRITICO, codigoEncriptacion = "AX-99")
public class TerminalMando {

    @PermisoRequerido(roles = {"ADMIN", "CAPITAN"})
    public void lanzarMisiles() {
        System.out.println("🚀 Misiles lanzados con éxito.");
    }

    @Override // Anotación incorporada: Ayuda al compilador a validar la sobrescritura.
    public String toString() {
        return "Terminal de Mando Central";
    }

    @Deprecated // Indica que este método ya no debe usarse.
    @SuppressWarnings("unused") // Dile al compilador que no se queje por variables no usadas.
    public void antiguoProtocolo() {
        int claveObsoleta = 123;
        System.out.println("Usando protocolo antiguo...");
    }
}

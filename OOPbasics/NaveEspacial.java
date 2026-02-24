/**
 * HERENCIA: NaveEspacial hereda de Vehiculo.
 * INTERFAZ: Implementamos una interfaz para demostrar abstracción pura.
 */

package OOPbasics;
public class NaveEspacial extends Vehiculo implements SistemaDefensa {
    
    private int nivelEnergia;

    public NaveEspacial(String modelo) {
        super(modelo);
        this.nivelEnergia = 100;
    }

    @Override
    public void iniciarMotor() {
        System.out.println("Sincronizando reactores de antimateria para: " + modelo);
    }

    // POLIMORFISMO DE SOBRECARGA (Overloading): 
    // Mismo método, distinta firma. Útil para dar opciones al usuario.
    public void disparar() {
        System.out.println("Disparo estándar efectuado.");
    }

    public void disparar(String tipoMunicion) {
        System.out.println("Disparando: " + tipoMunicion);
    }

    @Override
    public void activarEscudos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'activarEscudos'");
    }

    @Override
    public void realizarManiobraEvasiva() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarManiobraEvasiva'");
    }
}

package OOPbasics;
public class CazaEstelar extends NaveEspacial {

    public CazaEstelar(String modelo) {
        super(modelo);
    }

    // POLIMORFISMO DE SOBRESCRITURA (Overriding):
    // El Caza inicia el motor de forma distinta a una Nave genérica.
    @Override
    public void iniciarMotor() {
        System.out.println("Caza " + modelo + " encendiendo turbinas de plasma instantáneas.");
    }
}
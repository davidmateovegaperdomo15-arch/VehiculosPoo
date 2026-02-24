package colecciones;

import java.util.Comparator;

public class ComparadorPrecio implements Comparator<Suministro> {
    @Override
    public int compare(Suministro s1, Suministro s2) {
        return Double.compare(s1.getPrecio(), s2.getPrecio());
    }
}

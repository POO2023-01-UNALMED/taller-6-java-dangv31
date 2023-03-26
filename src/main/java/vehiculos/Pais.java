package vehiculos;
import java.util.List;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private static ArrayList<String> paisVenta = new ArrayList<String>();
    public Pais(String nombre){
        this.nombre=nombre;
        paisVenta.add(nombre);
        paisVenta.add("0");
    }
    public static String paisMasVendedor() {
        String mayor = paisVenta.get(0);
        int maximo=Integer.parseInt(paisVenta.get(1));
        for (int i = 1; i<=paisVenta.size();i=i+2){
            int p1=Integer.parseInt(paisVenta.get(i));
            if (p1 > maximo) {
                maximo=p1;
                mayor=paisVenta.get(i-1);
            }
        }
        return mayor;
    }

    public static ArrayList<String> getPaisVenta() {
        return paisVenta;
    }

    public static void setPaisVenta(ArrayList<String> paisVenta) {
        Pais.paisVenta = paisVenta;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

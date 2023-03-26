package vehiculos;
import java.util.List;
import java.util.ArrayList;


public class Fabricante {
    private String nombre;
    private Pais pais;
    private static ArrayList<String> fabricanteVenta = new ArrayList<String>();
    public Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;
        fabricanteVenta.add(nombre);
        fabricanteVenta.add("0");
    }
    public static String fabricaMayorVentas(){
        String mayor = fabricanteVenta.get(0);
        int maximo=Integer.parseInt(fabricanteVenta.get(1));
        for (int i = 1; i<=fabricanteVenta.size();i=i+2){
            int p1=Integer.parseInt(fabricanteVenta.get(i));
            if (p1 > maximo) {
                maximo=p1;
                mayor=fabricanteVenta.get(i-1);
            }
        }
        return mayor;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static ArrayList<String> getFabricanteVenta() {
        return fabricanteVenta;
    }

    public static void setFabricanteVenta(ArrayList<String> fabricanteVenta) {
        Fabricante.fabricanteVenta = fabricanteVenta;
    }
}

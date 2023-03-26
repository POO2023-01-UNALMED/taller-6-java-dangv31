package vehiculos;
import java.util.HashMap;
import java.util.Map;


public class Fabricante {
    private String nombre;
    private Pais pais;
    private static Map<Fabricante, Integer> fabricanteVenta=new HashMap<>();
    public Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;
        fabricanteVenta.put(this,0);
    }
    public static Fabricante fabricaMayorVentas(){
        int maximo=0;
        Fabricante mayor=null;
        for (Map.Entry<Fabricante,Integer> objeto: fabricanteVenta.entrySet()) {
            if(objeto.getValue()>maximo){
                mayor=objeto.getKey();
                maximo=objeto.getValue();
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

    public static Map<Fabricante, Integer> getFabricanteVenta() {
        return fabricanteVenta;
    }

    public static void setFabricanteVenta(Map<Fabricante, Integer> fabricanteVenta) {
        Fabricante.fabricanteVenta = fabricanteVenta;
    }
}

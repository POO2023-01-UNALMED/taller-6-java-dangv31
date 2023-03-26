package vehiculos;
import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    private static Map<Pais, Integer> paisVenta=new HashMap<>();
    public Pais(String nombre){
        this.nombre=nombre;
        paisVenta.put(this,0);
    }
    public static Pais paisMasVendedor() {
        int maximo=0;
        Pais mayor=null;
        for (Map.Entry<Pais,Integer> objeto: paisVenta.entrySet()) {
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
    public static Map<Pais, Integer> getPaisVenta() {
        return paisVenta;
    }
    public static void setPaisVenta(Map<Pais, Integer> paisVenta) {
        Pais.paisVenta = paisVenta;
    }
}

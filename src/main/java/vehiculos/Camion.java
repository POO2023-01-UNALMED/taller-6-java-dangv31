package vehiculos;
import java.util.List;
import java.util.ArrayList;
public class Camion extends Vehiculo {
    private int ejes;
    private int puertas = 2;
    private int velocidadMaxima = 80;
    private String traccion = "4X2";
    private static int CantidadCamion;

    public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int ejes) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.ejes = ejes;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.traccion = traccion;
        CantidadCamion++;
    }
    public Camion(String placa, String nombre, int peso, int velocidadMaxima, Fabricante fabricante, int ejes){
        this(placa,2,velocidadMaxima,nombre,0,peso,"4X2",fabricante,ejes);
    }
    public int getEjes() {
        return ejes;
    }
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    @Override
    public int getPuertas() {
        return puertas;
    }
    @Override
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    @Override
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    @Override
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    @Override
    public String getTraccion() {
        return traccion;
    }
    @Override
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public static int getCantidadCamion() {
        return CantidadCamion;
    }

    public static void setCantidadCamion(int cantidadCamion) {
        CantidadCamion = cantidadCamion;
    }
}

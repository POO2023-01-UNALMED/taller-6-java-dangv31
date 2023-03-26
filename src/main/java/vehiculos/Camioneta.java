package vehiculos;
import java.util.List;
import java.util.ArrayList;
public class Camioneta extends Vehiculo{
    private boolean volco;
    private int velocidadMaxima = 90;
    private String traccion = "4X4";
    private static int CantidadCamioneta;


    public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.volco = volco;
        this.velocidadMaxima = velocidadMaxima;
        this.traccion = traccion;
        CantidadCamioneta++;
    }
    public Camioneta(String placa, int puertas, String nombre, int peso, int velocidadMaxima, Fabricante fabricante, boolean volco){
        this(placa,puertas,velocidadMaxima,nombre,0,peso,"4X4",fabricante,volco);
    }
    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
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

    public static int getCantidadCamioneta() {
        return CantidadCamioneta;
    }

    public static void setCantidadCamioneta(int cantidadCamioneta) {
        CantidadCamioneta = cantidadCamioneta;
    }
}

package vehiculos;
public class Camioneta extends Vehiculo{
    private boolean volco;
    private int velocidadMaxima = 90;
    private String traccion = "4X4";
    private static int CantidadCamioneta;
    public Camioneta(String placa, int puertas, String nombre, int peso, int precio, Fabricante fabricante, boolean volco){
        super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
        this.volco = volco;
        CantidadCamioneta++;
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

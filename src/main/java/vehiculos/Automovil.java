package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;
    private int puertas = 4;
    private int velocidadMaxima = 100;
    private String traccion = "FWD";
    private static int CantidadAutomovil;

    public Automovil(String placa, String nombre, int velocidadMaxima, int peso, Fabricante fabricante, int puestos){
        super(placa,4,velocidadMaxima,nombre,0,peso,"FWD",fabricante);
        this.puestos=puestos;
        CantidadAutomovil++;
    }
    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
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

    public static int getCantidadAutomovil() {
        return CantidadAutomovil;
    }

    public static void setCantidadAutomovil(int cantidadAutomovil) {
        CantidadAutomovil = cantidadAutomovil;
    }
}

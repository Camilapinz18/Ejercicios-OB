public class Coche {

    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;

    public Coche(String marca, String modelo, int anio, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    public Coche() {
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", kilometraje=" + kilometraje +
                '}';
    }
}

package tema04;

public class SmartDevice {

    String marca;
    String modelo;
    double precio;
    String descripcion;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, double precio, String descripcion){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

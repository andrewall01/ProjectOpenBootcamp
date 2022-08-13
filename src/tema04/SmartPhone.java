package tema04;

public class SmartPhone extends SmartDevice{

    String fabricante;
    String color;

    public SmartPhone(String fabricante, String color) {
        this.fabricante = fabricante;
        this.color = color;
    }

    public SmartPhone(String marca, String modelo, double precio, String descripcion, String fabricante, String color) {
        super(marca, modelo, precio, descripcion);
        this.fabricante = fabricante;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

package tema04;

public class SmartWatch extends SmartDevice{

    boolean touch;

    public SmartWatch(boolean touch) {
        this.touch = touch;
    }

    public SmartWatch(String marca, String modelo, double precio, String descripcion, boolean touch) {
        super(marca, modelo, precio, descripcion);
        this.touch = touch;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", touch=" + touch +
                '}';
    }
}

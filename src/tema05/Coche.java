package tema05;

public class Coche {
    String id;
    String marca;
    String modelo;

    public Coche(){

    }

    public Coche(String id, String marca, String modelo) {
        this.id= id;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id='"+ id +'\''+
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

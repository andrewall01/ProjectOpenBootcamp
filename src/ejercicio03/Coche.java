package ejercicio03;

public class Coche {
    private int numPuertas= 1;

    public void incrementarPuertas(int numPuertas){
        int result = this.numPuertas+numPuertas;
        System.out.println("Número de puertas: "+result);
    }
}

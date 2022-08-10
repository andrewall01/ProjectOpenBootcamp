package ejercicio03;

public class Main {
    public static void main(String[] args) {
        suma(5,6,7);
        Coche myCoche =  new Coche();
        myCoche.incrementarPuertas(1);

    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a+b+c;
        System.out.println(resultado);
    }
}

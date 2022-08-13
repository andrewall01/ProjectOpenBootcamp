package tema02;

public class Ejercicio01 {

    public static void main(String [] args){
        System.out.println(calcularIVA(120.00));
    }

    public static double calcularIVA(double precio){
        double iva = 0.16;
        double  resultado = precio+ (precio * iva);

        return resultado;
    }
}

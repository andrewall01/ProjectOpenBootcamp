package ejercicio04;

public class Ejercicio04 {

    public static void main(String[] args) {
        int numeroIf = 10;
        int numeroWhile = 0;
        int numeroFor = 0;
        String estacion = "INVIERNO";

        //Bloque If
        if(numeroIf>0){
            System.out.println("El número es positivo");
        }
        else if(numeroIf<0){
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es cero");
        }

        //Bloque while
        while(numeroWhile<3){
            numeroWhile = numeroWhile+1;
            System.out.println("Bloque While: "+numeroWhile);
        }

        //Bloque do - while
        do{
            System.out.println("Bloque Do-While: "+numeroWhile);
        }while(numeroWhile==2);

        //Bloque For
        for(numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println("Bloque For: "+numeroFor);
        }

        switch(estacion){
            case "VERANO":
                System.out.println("La estación es VERANO");
                break;
            case "INVIERNO":
                System.out.println("La estación es INVIERNO");
                break;
            case "OTOÑO":
                System.out.println("La estación es OTOÑO");
                break;
            case "PRIMAVERA":
                System.out.println("La estación es PRIMAVERA");
                break;
            default:
                System.out.println("El valor de la variable no es una estación");
        }
    }


}

package tema04;

public class Main {

    public static void main(String[] args){
        /**
         * Ejemplo utilizando Herencia
         */

        //Objeto clase SmartDevice
        SmartDevice smartDevice = new SmartDevice();
        smartDevice.marca = "Samsung";
        smartDevice.modelo = "A50";
        smartDevice.precio = 1500.00;
        smartDevice.descripcion = "Nuevo";
        System.out.println(smartDevice);

        //Objeto Clase SmartPhone
        SmartPhone smartPhone = new SmartPhone("Sangsung", "A50",1500.00,"Nuevo","China","Plomo");
        System.out.println(smartPhone);

        //Objeto Clase SmartWatch
        SmartWatch smartWatch = new SmartWatch("Sangsung", "A50",1500.00,"Nuevo",true);
        System.out.println(smartWatch);

        /**
         * Ejemplo utilizando Polimorfismo
         */
        SmartDevice smartDevice1 = new SmartPhone("Sangsung", "A50",1500.00,"Nuevo","China","Plomo");
        System.out.println(smartDevice1);

        SmartDevice smartDevice2 = new SmartWatch("Sangsung", "A50",1500.00,"Nuevo",true);
        System.out.println(smartDevice2);
    }



}

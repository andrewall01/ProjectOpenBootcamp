package ejercicio09;

public class MainEjercicio09 {
    public static void main(String [] args){
        Cliente cliente = new Cliente();
        cliente.setEdad(30);
        cliente.setNombre("Francisco Luna");
        cliente.setTelefono("999888777");
        cliente.setCredito(100.00);

        System.out.println("Nombre Cliente: "+cliente.getNombre());
        System.out.println("Edad Cliente: "+cliente.getEdad());
        System.out.println("Teléfono Cliente: "+cliente.getTelefono());
        System.out.println("Crédito Cliente: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(35);
        trabajador.setNombre("Maria Rodriguez");
        trabajador.setTelefono("989878767");
        trabajador.setSalario(1500.00);

        System.out.println("Nombre Trabajador: "+trabajador.getNombre());
        System.out.println("Edad Trabajador: "+trabajador.getEdad());
        System.out.println("Teléfono Trabajador: "+trabajador.getTelefono());
        System.out.println("Salario Trabajador: "+trabajador.getSalario());

    }

}

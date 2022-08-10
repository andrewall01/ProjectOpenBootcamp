package ejercicio08;

public class MainPersona {

    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setTelefono("989777666");
        persona.setNombre("Patricia Perez");

        System.out.printf("Nombres: "+persona.getNombre()+"\n");
        System.out.printf("Telefono: "+persona.getTelefono()+"\n");
        System.out.printf("Edad: "+persona.getEdad());

    }

}

package ejercicio08;

public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

     public void setEdad(int edad){
         this.edad = edad;
     }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
         return nombre;
    }

    public void setTelefono(String telefono){
         this.telefono = telefono;
    }

    public String getTelefono(){
         return telefono;
    }
}

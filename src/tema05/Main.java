package tema05;

public class Main {

    public static void main(String[] args) {
        CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();
        Coche coche = new Coche();
        cocheCRUD.save(coche);
        cocheCRUD.findAll(coche.id);
        cocheCRUD.delete(coche.id);
    }
}

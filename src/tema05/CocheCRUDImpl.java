package tema05;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {
        System.out.println("Se guarda nuevo objeto");
    }

    @Override
    public Coche findAll(String id) {
        return new Coche();
    }

    @Override
    public void delete(String id) {
        System.out.println("Se elimina coche:" + id);
    }
}

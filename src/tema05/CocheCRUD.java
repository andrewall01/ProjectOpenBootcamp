package tema05;

public interface CocheCRUD {

    void save(Coche coche);

    Coche findAll(String id);

    void delete(String id);

}

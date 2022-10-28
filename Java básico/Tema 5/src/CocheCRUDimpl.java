import java.util.ArrayList;
import java.util.List;

public class CocheCRUDimpl implements CocheCRUD{

    List<Coche> listadoCoches= new ArrayList<Coche>();

    @Override
    public void save(Coche coche) {
        listadoCoches.add(coche);
        System.out.println("CocheCRUDimpl.save():"+" Se ha guardado el coche "+coche);
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("CocheCRUDimpl.findAll()");
        return listadoCoches;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println(("CocheCRUDimpl.delete():"+" Se ha eliminado el coche "+coche));
        listadoCoches.remove(coche);
    }
}

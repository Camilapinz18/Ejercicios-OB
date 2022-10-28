import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Coche> enVenta=new ArrayList<Coche>();

        CocheCRUD cocheCrud = new CocheCRUDimpl();

        Coche mazda=new Coche("Mazda","929 III", 1990,  151945.3);
        Coche bmw=new Coche("BMW","Serie 2",2019,62412.5);
        Coche mercedes=new Coche("Mercedes-Benz","230",1981,193247.7);

        cocheCrud.save(mazda);
        cocheCrud.save(bmw);
        cocheCrud.save(mercedes);

        enVenta=cocheCrud.findAll();
        System.out.println(enVenta);

        cocheCrud.delete(mazda);
        System.out.println(enVenta);
    }





}

public class Main
{

    public static void main(String[] args)
    {
        Persona persona=new Persona();
        persona.setEdad(25);
        persona.setNombre("Diego");
        persona.setTelefono("3015106398");

        System.out.println(persona.getNombre()+" tiene "+persona.getEdad()+" años. Su numero telefonico es: "+persona.getTelefono());

        Persona persona2=new Persona();
        persona2.setEdad(60);
        persona2.setNombre("Lucia");
        persona2.setTelefono("3125638712");

        System.out.println(persona2.getNombre()+" tiene "+persona2.getEdad()+" años. Su numero telefonico es: "+persona2.getTelefono());

    }
}

class Persona
{
    private int edad;
    private String nombre;
    private String telefono;


    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

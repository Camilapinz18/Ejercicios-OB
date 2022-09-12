public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente=new Cliente(37, "Paola", "3015236578", 5632789.2 );
        System.out.println(cliente.nombre+" es una cliente. Tiene "+cliente.getEdad()+" años. Su telefono es: "+cliente.getTelefono()+". Tiene un credito por $ "+cliente.getCredito());

        Trabajador trabajador= new Trabajador(49, "Armando", "3216549856", 2250000);
        System.out.println(trabajador.nombre+" es un empleado del banco. Tiene "+trabajador.getEdad()+" años. Su telefono es: "+trabajador.getTelefono()+". Su salario es de $ "+trabajador.getSalario()+" mensuales");
    }
}

class Persona
{
    protected int edad;
    protected String nombre;
    protected String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona
{
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Trabajador extends Persona
{
    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

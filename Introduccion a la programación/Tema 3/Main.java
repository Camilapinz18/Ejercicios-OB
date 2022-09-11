package EjercicioOP;

public class Main {

    public static void main(String []args)
    {
        int suma;
        suma=sumar(5,7,3);
        System.out.println("El resultado de la suma es: "+suma);
        /////////////////////////////////
        Coche miCoche=new Coche();
        miCoche.anadirPuerta(5);
        System.out.println("No. de puertas coche: "+ miCoche.numeroPuertas);
    }
    public static int sumar(int a, int b, int c)
    {
        int resultado=a+b+c;
        return resultado;
    }
}
class Coche
{
    int numeroPuertas;
    public void anadirPuerta(int puertas)
    {
        numeroPuertas+=puertas;
    }
}

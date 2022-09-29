package Tema1;

public class Main {
    public static void main(String[] args) {
        //Enteros:
        byte pagina=10;
        short edad=45;
        int referencia=456123;
        long telefono=301510639;

        System.out.println("Estamos en la página "+pagina+" del libro");
        System.out.println("La persona tiene "+edad+" años");
        System.out.println("La referencia del libro es: "+referencia);
        System.out.println("Mi número de telefono es: "+telefono);

        //Decimales:
        float precio=45.83f;
        double impuesto=78.43d;

        System.out.println("El precio del artículo es de: "+precio);
        System.out.println("El impuesto a pagar es de: "+impuesto);

        //Booleanos:
        boolean activo=true;
        boolean residente=false;

        System.out.println("El usuario se encuentra activo? "+activo);
        System.out.println("La persona es residente en el país? "+residente);

        //Texto:
        char letra='X';
        String texto="Open Bootcamp";

        System.out.println("Pulsa la letra "+letra+" para salir");
        System.out.println("El estudiante estudia Java en "+texto);




    }
}

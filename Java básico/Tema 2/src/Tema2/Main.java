package Tema2;

public class Main {
    public static void main(String[] args) {
        //Para este ejercicio tendréis que crear una
        // función que reciba un precio y devuelva el precio con el IVA incluido.

        float precio=0;
        float iva=0;
        float precioIva;

        precio=56.23f;
        System.out.println("El precio del producto sin IVA es de: "+precio);

        iva=anadirIva(precio);
        precioIva=precio+iva;
        System.out.println("El precio del producto con iva es de: "+precioIva);
    }

    public static float anadirIva(float precio)
    {
        float iva=0.19f;
        float precioConIva=precio*iva;
        return precioConIva;
    }
}

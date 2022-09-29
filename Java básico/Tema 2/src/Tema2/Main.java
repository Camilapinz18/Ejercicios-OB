package Tema2;

public class Main {
    public static void main(String[] args) {
        //Para este ejercicio tendréis que crear una
        // función que reciba un precio y devuelva el precio con el IVA incluido.

        float precio=165.25F;
        System.out.println("El precio del producto sin IVA es de: "+precio);

        float precioIva=anadirIva(precio);
        System.out.println("El precio del producto con IVA es de: "+precioIva);
    }

    public static float anadirIva(float precio)
    {
        float iva=0.19f;
        float precioConIva=precio*iva;
        return precio+precioConIva;
    }
}

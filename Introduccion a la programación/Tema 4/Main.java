package EJOB4;

public class Main {
    public static void main(String[] args) {

        /*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/

        int numeroIf=-89;

        if(numeroIf!=0)
        {
            if(numeroIf>0)
            {
                System.out.println("El numero "+numeroIf+" es positivo");
            }
            else
            {
                System.out.println("El numero "+numeroIf+" es negativo");
            }
        }
        else
        {
            System.out.println("El numero es 0");
        }

        /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.*/

        int numeroWhile=-1;
        while(numeroWhile<3)
        {
            numeroWhile++;
            System.out.println("While: "+numeroWhile);
        }

        /*Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.*/

        int numeroDoWhile=2;
        do
        {
            numeroDoWhile++;
            System.out.println("DoWhile: "+numeroDoWhile);
        } while(numeroDoWhile<3);

        /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que
        la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/

        int numeroFor;

        for(numeroFor=0; numeroFor<=3;numeroFor++)
        {
            System.out.println("For: "+numeroFor);
        }

        /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación.*/

        String estacion="invierno";

        switch (estacion)
        {
            case "verano":
                System.out.println("Estamos en verano. La temperatura es de 34 grados centgrados");
                break;
            case "invierno":
                System.out.println("Estamos en invierno. La temperatura es de -5 grados centigrados");
                break;
            case "otoño":
                System.out.println("Estamos en otoño. La temperatura es de 10 grados centígrados");
                break;
            case "primavera":
                System.out.println("Estamos en primavera. La temperatura es de 16 grados centigrados");
                break;
            default:
                System.out.println("¡Incorrecto!Esta no es una estación.");

        }
    }
}

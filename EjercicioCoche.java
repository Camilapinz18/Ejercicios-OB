public class Coche {

        public static void main(String []args){
            Coche_ miCoche=new Coche_();
            miCoche.anadirPuerta(5);
            System.out.println("No. de puertas coche: "+ miCoche.numeroPuertas);
        }
    }
    /////////////////////////////////////////
     class Coche_
    {
        int numeroPuertas;

        public void anadirPuerta(int puertas)
        {
            numeroPuertas+=puertas;
        }
    }


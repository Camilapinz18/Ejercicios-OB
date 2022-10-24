public class Main {
    public static void main(String[] args) {
        String[] nombres = {"ana", "luis", "maria", "juan"};
        String texto="";

        for(String nombre:nombres){
            texto+=nombre+" ";
        }

        System.out.println(texto);
    }
}

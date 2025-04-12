//anadir comentarios
import java.util.Scanner;

public class TallerJava {
    public static void main(String[] args) {
                Scanner scann = new Scanner (System.in);
        System.out.print("Ingresa los nombres: ");
        String [] nombres = new String[5];
        System.out.print("Ingresa las edades: ");
        int [] edades = new int[5];
        System.out.print("Ingresa los estados: ");
        String [] estados = new String[5];

        for (int i = 0; i < nombres.length; i++) {

            nombres[i] = scann.nextLine();

        }

        for (int i = 0; i < nombres.length; i++) {

            edades[i] = scann.nextInt();
            
        }

        for (int i = 0; i < nombres.length; i++) {

            estados[i] = scann.nextLine();
            
        }


    }

}

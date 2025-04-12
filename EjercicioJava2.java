import java.util.Scanner;

public class EjercicioJava2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner (System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scann.nextLine();
        System.out.print("Ingresa tu edad: ");
        String edad = scann.nextLine();
        System.out.print("Ingresa tu correo: ");
        String correo = scann.nextLine();

        System.out.println("");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
    }

}

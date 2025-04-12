
import java.util.Scanner;

public class EjercicioJava1 {
    public static void main(String[] args) {
        double suma = 0;
        double resta = 0;
        double multiplicacion = 0;
        double modulo = 0;
        double[] numeros = new double [2];
        Scanner scan = new Scanner (System.in);

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa un numero: ");
            numeros[i] = scan.nextDouble();

            suma += numeros[i];
            resta = numeros [0] - numeros[1];
            multiplicacion = numeros [0] * numeros [1];
            modulo = numeros [0] % numeros[1];
        }
        
        System.out.println("La suma de tus numeros es: " + suma);
        System.out.println("La resta de tus numeros es: " + resta);
        System.out.println("La multiplicacion de tus numeros es: " + multiplicacion);
        System.out.println("El residuo de la division de tus numeros es: " + modulo);


    }
}
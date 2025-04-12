import java.util.Scanner;

public class EjercicioJava3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner (System.in);
        boolean condicion = true;
        do{
            System.out.print("Ha que figura quieres sacarle el area?: ");
            String figura = scann.nextLine();
    
            switch (figura) {
    
                case "Triangulo":
    
                    System.out.println("Ingresa la medida de sus lados: ");
                    float lados = scann.nextFloat();
    
                    double area = lados * lados /2;
                    System.out.println("El area del triangulo es: " + area);
    
                    break;
    
                case "Circulo":
    
                    System.out.println("Ingresa el radio del circulo: ");
                    float radio = scann.nextFloat();
    
                    double areac = radio * radio * 3.1416;
                    System.out.println("El area del circulo es: " + areac);
    
                    break;
    
                case "Rectangulo":
                    System.out.println("Ingresa la base del rectangulo: ");
                    float base = scann.nextFloat();
    
                    System.out.println("Ingresa la altura del rectangulo: ");
                    float altura = scann.nextFloat();
    
                    double arear = base * altura;
                    System.out.println("El area del circulo es: " + arear);
    
                    break;
            
                default:
                    System.out.println("Figura no utilizable o no escribiste la primera letra en mayus");
                    break;
            }
    
        } while (condicion);
    }
}

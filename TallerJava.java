1. Ejercicio - Registro de Usuarios y Verificación de Mayoría de Edad.

    import java.util.Scanner;

public class RegistroUsuarios {
    public static void main(String [] args) {
        
        //Nombramos nuestra funcion Scanner
        Scanner scan = new Scanner(System.in);

        //Nombramos, definicimos y delimitamos nuestros arrays
        String[] nombres = new String [5];
        int [] edades = new int[5];

        //Le pedimos al usuario la informacion para el array nombres
        System.out.println("Introduce la lista de nombres (5 personas)");
        System.out.println("");

        //Conforme el usuario introduzca un nombre se pasara al siguiente indice del array hasta el limite 
        //que ya hemos definido
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = scan.nextLine();
        }
        
        //Le pedimos al usuario la informacion para el array edades
        System.out.println("");
        System.out.println("Introduce las edades de las personas");
        System.out.println("");

        //Conforme el usuario introduzca una edad se pasara al siguiente indice del array hasta el limite 
        //que ya hemos definido
        for (int i = 0; i < edades.length; i++) {
            edades[i] = scan.nextInt();
        }
        
        System.out.println("");

        //Hacemos la probacion de si los usuarios son mayores o menores de edad
        for (int i = 0; i < edades.length; i++) {
            
            //Al comprobar si el dice es verdadero o falso mostramos un mensaje dependiendo del boolean recibido
            if (edades[i] < 18) {
                System.out.println("El usuario " + nombres[i] + " es menor de edad");
            } else {
                System.out.println("El usuario " + nombres[i] + " es mayor de edad");
            }

        }
        scan.close();
    }
}

2. Ejercicio - Datos Personales y Arreglos de Calificaciones.

    public class InformacionPersonal {
    public static void main(String[] args) {

        //Nombramos y asignamos valor a nuestras variables y arrays
        String nombre = "Cristian";
        int edad = 17;
        double estatura = 1.86;
        String inicial = "C";
        boolean esEstudiante = true;
        int[] notas = {89, 59, 98, 52, 98};

        //Creamos un dialogo en donde utilizamos nuestras variables
        System.out.println("Hola, me nombre es " + nombre + " tengo " + edad + " años, mido " + estatura + 
        " metros, mi inicial es " + inicial + " es un estudiante?: " + esEstudiante);

        System.out.println("");

        //Hacemos un bloque de codigo en donde mostrara la posicion de la calificacion y su respectivo valor
        for (int i = 0; i < notas.length; i++) {

            System.out.println("Valor de la nota en la posicion " + i + ": " + notas[i]);

        }

    }
}

3. Ejercicio - Determinación de Números Pares e Impares.

    import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        //Nombramos nuestra funcion Scanner
        Scanner scan = new Scanner(System.in);
         
        //Le pedimos al usuario que ingrese la cantidad de numeros que quiere evaluar 
        //(se recorrera del 0 hasta el numero deseado)
        System.out.print("Ingresa cuantos numeros quieres evaluar: ");
        int numeros = scan.nextInt();

        //Le mostramos al usuario que numeros son pares y cuales no
        for(int i = 1; i <= numeros; i++) {
            if (i % 2 == 0){
                System.out.println("El numero " + i + " es par.");
            } else {
                System.out.println("El numero " + i + " es impar.");
            }
        }
        scan.close();
    }
}

4. Ejercicio - Calculadora Básica con Funciones y Operadores.

    import java.util.Scanner;

public class CalculadoraBasica {

    // Empazamos creando nuestras "funciones" para simplificar el codigo.
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        
        if(b == 0){
            System.out.println("Error: no se puede dividir por 0.");
            return 0;
        } else {
            return a / b;
        }
    }

    //Empazamos con el bloque de codigo principal
    public static void main(String [] args) {

        //Nombramos nuestra funcion Scanner
        Scanner scan = new Scanner(System.in);
        
        //Pedimos al usuario los numeros
        System.out.print("Ingresa el primer numero: ");
        int n1 = scan.nextInt();
        System.out.println("");
        System.out.print("Ingresa el segundo numero: ");
        int n2 = scan.nextInt();

        //Invocamos las "funciones" para que hagan su respectivo proceso y mostrar su resultado al uusuario
        System.out.println("Suma: " + (sumar(n1, n2)));
        System.out.println("Resta: " + (restar(n1, n2)));
        System.out.println("Multiplicacion: " + (multiplicar(n1, n2)));
        System.out.println("Division: " + (dividir(n1, n2)));
        
        //Hacemos un punto de ddesicion para comprobar si el n1 es mayor que el n2 o al contrario
        if (n1 > n2) {
            System.out.println("El Primer numero (" + n1 + ") es mayor que el segundo numero (" + n2 + ")");
        } else {
            System.out.println("El segundo numero (" + n2 + ") es mayor que el primer numero (" + n1 + ")");
        }
        scan.close();
    }

}

5. Ejercicio - Menú Interactivo y Cálculo de Áreas.

    import java.util.Scanner;

public class MenuCalculadora {
    
    //Creamos nuestras "funciones" para los procesos que realizares, asi podremos simplificar nuestro codigo
    public static double AreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double AreaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    public static double AreaRectangulo(double base, double altura) {
        return base * altura;
    }

    //Hacemos el bloque de codigo principal
    public static void main(String[] args) {
        //Nombramos nuestra funcion Scanner
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        //Creamos un buvle para que se muestre el numero hasta que el usuario quiere salir completamente de este
        do{
            //Mostramos el menu
            System.out.println("");
            System.out.println("|| Menu Principal ||");
            System.out.println("");
            System.out.println("1. Calcular el area de un circulo");
            System.out.println("2. Calcular el area de un triangulo");
            System.out.println("3. Calcular el area de un rectangulo");
            System.out.println("4. Salir");
            System.out.println("");
            //Pedimos que elija una opcion
            System.out.print("Elige lo que quieres hacer: ");
            opcion = scan.nextInt();
            System.out.println("");

            //Evaluamos la respuesta y creamos un switch para hacer el proceso deseado por el usuario
            switch (opcion) {

                case 1:
                    //Pedimos el valor para la variable que utilizaremos
                    System.out.print("Introduce el radio del circulo: ");
                    int radio = scan.nextInt();
                    //Finalmente mostramos el resultado
                    System.out.println("");
                    System.out.println("El area de tu circulo es de: " + AreaCirculo(radio));
                    System.out.println("");
                    break;

                case 2:
                    //Pedimos el valor para las variables que utilizaremos
                    System.out.println("Introduce la base y luego la altura de tu triangulo: ");
                    int base = scan.nextInt();
                    int altura = scan.nextInt();
                    //Finalmente mostramos el resultado
                    System.out.println("");
                    System.out.println("El area de tu triangulo es de: " + AreaTriangulo(base, altura));
                    System.out.println("");
                    break;

                case 3:
                    //Pedimos el valor para las variables que utilizaremos
                    System.out.println("Introduce la base y luego la altura de tu rectangulo: ");
                    int base1 = scan.nextInt();
                    int altura1 = scan.nextInt();
                    //Finalmente mostramos el resultado
                    System.out.println("");
                    System.out.println("El area de tu rectangulo es de: " + AreaRectangulo(base1, altura1));
                    System.out.println("");
                    break;
                
                case 4:
                    //Avisamos de que se esta saliendo del programa
                    System.out.println("Saliendo de la calculadora...");
                    System.out.println("");
                    break;

                default:
                    //Avisamos al usuario que su opcion no existe
                    System.out.println("");
                    System.out.println("Opcion inexistente, elige una opcion del menu...");
                    System.out.println("");
                    break;
            }
        
        //Cerramos el bucle cuando el usuario elija la opcion de "Salir" (4)
        } while (opcion != 4);

        scan.close();
    }
}

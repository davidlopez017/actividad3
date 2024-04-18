import java.util.Scanner;

public class visitantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        int edad;
        char genero;


        // Captura de datos del usuario
        System.out.print("Ingrese el nombre del visitante: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del visitante: ");
        edad = scanner.nextInt();

        System.out.print("Ingrese el género (M/F): ");
        genero = scanner.next().charAt(0);

        if (edad >= 18) {
            System.out.println("\nInformación del visitante:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Género: " + genero);
            System.out.print("Permiso aceptado");

        } else {
            System.out.println("\nInformación del visitante:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Género: " + genero);
            System.out.print("Permiso negado");
        }
        //ningun otro cambio
    }
}


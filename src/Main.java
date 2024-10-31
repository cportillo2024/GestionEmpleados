import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==== Menu de Gestion de Empleados ====");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Mostrar Empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un numero valido.");
                scanner.next(); // Limpiar entrada incorrecta
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese la edad del empleado: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Por favor, ingrese un numero valido.");
                        scanner.next();
                    }
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    System.out.print("Ingrese el salario del empleado: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Por favor, ingrese un numero valido.");
                        scanner.next();
                    }
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer

                    // Crear y agregar el empleado usando el constructor correcto
                    Empleado empleado = new Empleado(nombre, edad, salario);
                    gestor.agregarEmpleado(empleado);
                    break;

                case 2:
                    gestor.mostrarEmpleados();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close(); // Cerrar el scanner al final
    }
}

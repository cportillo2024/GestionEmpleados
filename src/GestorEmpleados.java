import java.util.ArrayList;

public class GestorEmpleados {
    private ArrayList<Empleado> listaEmpleados;

    public GestorEmpleados() {
        listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        System.out.println("Empleado agregado con exito.");
    }

    public void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("=== Lista de Empleados ===");
            for (Empleado emp : listaEmpleados) {
                emp.imprimirInformacion();
                System.out.println("-------------------------");
            }
        }
    }
}

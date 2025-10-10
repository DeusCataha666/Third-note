package Empresa;

public class Main {

    public static void main(String[] args) {
        // Crear empleados
        Empleado e1 = new Empleado(101, "Carlos Ruiz", 3000.0);
        Empleado e2 = new Empleado(102, "Ana Torres", 3200.0);

        // Crear gerentes
        Gerente g1 = new Gerente(201, "Laura Gómez", 5000.0, "Marketing");
        Gerente g2 = new Gerente(202, "Luis Mendoza", 5500.0, "Finanzas");

        // Crear proyecto
        Proyecto proyecto = new Proyecto(1, "Impulzo");

        // Asignar empleados al proyecto
        proyecto.asignarEmpleado(e1);
        proyecto.asignarEmpleado(e2);
        proyecto.asignarEmpleado(g1);
        proyecto.asignarEmpleado(g2);

        // Mostrar información del proyecto
        proyecto.mostrarInfo();

        // Calcular y mostrar costo total del proyecto
        // double costoTotal = proyecto.calcularCosto();
        // System.out.println("\nCosto total del proyecto: $" + costoTotal);
    }

}

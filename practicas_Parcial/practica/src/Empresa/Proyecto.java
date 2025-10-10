package Empresa;

import java.util.List;
import java.util.ArrayList;

public class Proyecto {
    private int id;
    private String nombre;
    private List<Empleado> empleados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleado(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Proyecto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void asignarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarInfo() {
        System.out.println("Proyecto: " + nombre);
        System.out.println("Empleados asignados:");
        for (Empleado emp : empleados) {
            emp.mostrarInfo();
        }
    }

}

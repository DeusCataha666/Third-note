package Universidad;

import java.util.List;
import java.util.Scanner;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    private static List<Estudiante> estudiantes;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso(String codigo, String nombre, Profesor profesor, List<Estudiante> estudiantes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public void inscribirEstudiante(List<Estudiante> nuevosEstudiantes) {
        for (Estudiante e : nuevosEstudiantes) {
            if (!estudiantes.contains(e)) {
                estudiantes.add(e);
                System.out.println("El estudiante " + e.getNombre() + " ha sido matriculado exitosamente.");
            } else {
                System.out.println("El estudiante " + e.getNombre() + " ya está matriculado en este curso.");
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Información del curso");
        System.out.println("Codigo del curso: " + codigo);
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Profesor asignado: " + profesor.getNombre());


        System.out.println("Lista de estudiante:");
        for (Estudiante e : estudiantes){
            System.out.println("- " + e.getNombre());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Ingrese el codigo del curso:");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el nombre del curso:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el prfesor asignado a el curso:");
        Profesor profesor = new Profesor(0, "", "");
        profesor.setNombre(scanner.nextLine());
        System.out.println("Ingrese el codigo del curso:");
        Estudiante estudiante = new Estudiante(0, "", "");
        estudiante.setNombre(scanner.nextLine());

        Curso curso = new Curso(codigo, nombre, profesor, estudiantes);
        curso.mostrarInfo();

        scanner.close();
    }

}

package semana5;

public class estudiantes {
    public String nombre;
    public int edad;
    public String curso;

    public void registrarEstudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        System.out.println("Estudiante registrado: " + nombre + ", Edad: " + edad + ", Curso: " + curso);
    }

}


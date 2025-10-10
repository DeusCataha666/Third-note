package Universidad;

public class Estudiante {
    private int id;
    private String nombre;
    private String carrera;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(int id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public void mostrarInfo() {
        System.out.println("Información del estudiante");
        System.out.println("id: " + id);
        System.out.println("Nombre de estudiante: " + nombre);
        System.out.println("Carrera: " + carrera);
    }

}

package Universidad;

public class Profesor {
    private int id;
    private String nombre;
    private String departamento;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public Profesor(int id, String nombre, String departamento){
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public void mostrarInfo(){
        System.out.println("Información del profesor");
        System.out.println("id: " + id);
        System.out.println("Nombre de profesor: " + nombre);
        System.out.println("Departamento: " + departamento);
    }
}

 




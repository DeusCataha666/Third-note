package Empresa;


public class Gerente extends Empleado {
    private String departamento;

    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public Gerente(int id, String nombre, double salario, String departamento){
        super(id, nombre, salario);
        this.departamento = departamento;
    }

    public double calcularBono(){
        return getSalario() * 0.20;
    }

        public void mostarInfo(){
        System.out.println("Informacion del Gerente: ");
        System.out.println("Id: " + getId() + "Nombre: " + getNombre() + "Salario: " + getSalario() + "Departamento: " + departamento);
    }

}

package Empresa;

import java.util.Scanner;

public class Empleado {
    private int id;
    private String nombre; 
    private double salario;

    Scanner sc = new Scanner(System.in);

    public int getId(){
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

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public Empleado(int id, String nombre, double salario){
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularBono(){
        return getSalario() * 0.05;
    }

    public void mostrarInfo(){
        System.out.println("Informacion del empleado: ");
        System.out.println("Id: " + id + "Nombre: " + nombre + "Salario: " + salario);
    }

}

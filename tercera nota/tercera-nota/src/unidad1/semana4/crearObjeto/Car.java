package semana4.crearObjeto;

public class Car {
    String brand;
    int year;
    
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void ShowInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

package semana5.producto.utils;

public class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void ShowInfo() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }

    
}
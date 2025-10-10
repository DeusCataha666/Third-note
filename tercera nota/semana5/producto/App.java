package semana5.producto;

import java.util.ArrayList;

import semana5.producto.utils.Product;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 1200.00));
        products.add(new Product("Smartphone", 800.00));
        products.add(new Product("Tablet", 400.00));
        products.add(new Product("Monitor", 300.00));
        products.add(new Product("Keyboard", 100.00));
    

        for (Product product : products) {
            product.ShowInfo();
        }
    }
}

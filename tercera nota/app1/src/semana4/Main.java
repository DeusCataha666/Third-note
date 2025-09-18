package semana4;

import semana4.crearObjeto.Car;
import semana4.overLoading.Calculator;
import semana4.pasaporReferencia.Box;

public class Main {

    public static void changeBox(Box newBox) {
       newBox.size = 10;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sumar(5, 3));
    
        Car car1 = new Car("Toyota", 2020);
        car1.ShowInfo();
        Car car2 = new Car("Honda Civic", 2005);
        car2.ShowInfo();

        Box box = new Box(50);
        System.out.println("Box size before change: " + box.size);

        changeBox(box);
        System.out.println("Box size after change: " + box.size);

    }

}

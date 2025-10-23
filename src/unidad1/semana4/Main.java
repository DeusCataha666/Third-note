package semana4;

import semana4.pasaporReferencia.Box;

public class Main {

    public static void changeBox(Box newBox) {
       newBox.size = 10;
    }

    public static void main(String[] args) {
        Box box = new Box(50);
        System.out.println("Box size before change: " + box.size);

        changeBox(box);
        System.out.println("Box size after change: " + box.size);

    }

}

// file name to be changed 
// collided with package 

import java.util.ArrayList;

public class ArrayListObj{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Ford");
        cars.add("Volvo");

        System.out.println(cars);
        System.out.println(cars.set(0, "Dacia"));
        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars.get(0));

    }
}

import javax.sound.midi.Soundbank;

public class Constructor {

    String car;
    int age;

    public Constructor(String name, int years ){
        car = name;
        age = years;
    }

    public static void main(String[] args) {
        Constructor myCar = new Constructor( "150 SL",55);

        System.out.println(myCar.car);
        System.out.println(myCar.age);

    }
}
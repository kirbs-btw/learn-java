import java.util.function.Consumer;
import java.util.ArrayList;


public class LambdaFunc{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Consumer<Integer> method = (n) -> {System.out.println(n); };
        numbers.add(5);
        numbers.add(3);
        numbers.forEach(method);


    }


}
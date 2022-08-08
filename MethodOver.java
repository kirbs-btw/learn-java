public class MethodOver{

    static int add(int a, int b){
        return a + b;
    }
    static double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(3, 4));
        System.out.println(add(0.1, 0.2));
        System.out.println(add(0.1, 2));
    }
}
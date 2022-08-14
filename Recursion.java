public class Recursion {

    public static int fac(int start, int end){
        if (end > start){
            System.out.println("if");
            System.out.println(end);

            return end * fac(start, end - 1);

        }   else{
            System.out.println("else");

            return 0;
        }

    }

    public static void main(String[] args) {
        int result = fac(5, 10);
        System.out.println(result);

    }
}
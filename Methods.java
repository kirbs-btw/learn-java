public class Methods {
    public static void calc(int n, int f){
        System.out.println(n * f);
    }

    static int square(int n){
        return n * n;
    }


    public static void main(String[] args) {
        int n = 42;
        int f = 3;
        calc(n, f);
        int moreN = square(n);
        System.out.println(moreN);

    }
}
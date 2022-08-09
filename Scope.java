public class Scope {

    public static void main(String[] args) {
        // setting scope in java

        // starting the scope block
        {
            int a = 5;

            // this is in scope
            System.out.println(a);

            {
                System.out.println(a);
            }

        }

        // System.out.println(a);
        // a is out of scope here

    }
}
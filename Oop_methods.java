public class Oop_methods {

    static void scream(){
        System.out.println("AHHHHHHH");
    }

    public void shout(){
        System.out.println("OHHHHHHHHHHHHHHH");
    }


    public static void main(String[] args) {
        scream();

        Oop_methods my_obj = new Oop_methods();
        my_obj.shout();


    }
}
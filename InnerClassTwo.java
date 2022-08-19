class Outer{

    int num = 4;

    static class Inner{
            int other = 5;
    }
}





public class InnerClassTwo{

    public static void main(String[] args) {
        Outer.Inner myObj = new Outer.Inner();
        System.out.println(myObj.other);

    }

}
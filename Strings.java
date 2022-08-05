public class Strings {
    public static void main(String[] args) {

        String text = "hello sir THIS is cool";
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.indexOf("THIS"));

        String nameOne = "Smith";
        String nameTwo = "Jeff";

        System.out.println(nameOne + " " + nameTwo);
        System.out.println(nameOne.concat(nameTwo));

        String num = "50";
        int numTwo = 10;
        String a = num + numTwo;
        System.out.println(a);


    }
}

public class Ceasar{
    String dic = "abcdefghijklmnopqrstuvwxyz ";

    static String ceasar(String txt, int shift){
        String newTxt = "";

        for (int i = 0; i < txt.length(); i++){
            int charASCII = (int) txt.charAt(i);
            int new_ascii_num = (charASCII + shift) % 256;

            char charLetter = (char) (new_ascii_num);
            newTxt += charLetter;
        }


        return newTxt;
    }

    public static void main(String[] args){
        String txt = "hello sir this is very cool to see that you are here!";
        String a = ceasar(txt, 1);
        String oldTxt = ceasar(a, -1);
        System.out.println(txt);
        System.out.println(a);
        System.out.println(oldTxt);

    }
}
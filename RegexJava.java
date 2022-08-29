import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* there are many regular expressions
* look up at https://www.w3schools.com/java/java_regex.asp
*
*/

public class RegexJava{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello sir");
        boolean match = matcher.find();

        if(match){
            System.out.println("There is a match!");

        } else {
            System.out.println("no sorry!");

        }
    }
}
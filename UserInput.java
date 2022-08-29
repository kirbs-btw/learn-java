import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        Scanner searchWord = new Scanner(System.in);
        System.out.println("Enter username: ");

        String userName = searchWord.nextLine();
        System.out.println("Hello " + userName);
    }
}
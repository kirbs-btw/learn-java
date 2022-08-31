package files;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileJava{
    public static void main(String[] args) {
        try{
            File file = new File("H:\\Projekte\\Projekte\\Project 114\\java\\learn-java\\src\\files\\data.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
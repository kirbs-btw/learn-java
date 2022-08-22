import java.time.*;


public class Date{
    public static void main(String[] args) {
        LocalDate dateObj = LocalDate.now();
        LocalTime timeObj = LocalTime.now();
        System.out.println(dateObj);
        for (int i = 0; i< 10000; i++){
            System.out.println(timeObj);
        }
        // date obj does not change time to get the current time init the obj
        // again

    }
}

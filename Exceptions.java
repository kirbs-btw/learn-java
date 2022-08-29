public class Exceptions{
    public static void main(String[] args) {
        int index = 5;
        String[] names = {
                "John", "Leo", "Eric"
        };

        try{
            if (index >(names.length-1)){
                throw new ArithmeticException("index to high");
            }
        }
        catch(Exception e){
            System.out.println(e);
            index = 0;
            System.out.println(names[index]);

        }
        finally {
            System.out.println("index was to high \nindex has been changed");
        }
    }
}
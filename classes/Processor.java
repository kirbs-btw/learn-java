package classes;

/*
* Learned:
*   It's odd to work with classes because for every class there has to
*   be a new file so having an easy overview could be difficult
*
*   except from that the behaviour of classes it is quite normal
*/

public class Processor {
    public static void main(String[] args){
        Data data = new Data();

        for (int i = 0; i < data.numbers.length; i++){
            int realValue = data.numbers[i] * 5;

            System.out.println(realValue);
        }
    }
}
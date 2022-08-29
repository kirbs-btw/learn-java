// avoid concurrency problems
// when two or more threads work with the same variables there is no way to predict the outcome

public class ThreadsJava extends Thread{
    public static void main(String[] args) {
        ThreadsJava thread = new ThreadsJava();
        thread.start();
        for (int i = 0; i < 100; i++){
            System.out.println(i);
        }
    }

    public void run(){
        System.out.println("running thread");
        for (int j = 100; j < 200; j++){
            System.out.println(j);
        }
    }
}
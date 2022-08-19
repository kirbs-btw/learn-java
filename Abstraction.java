abstract class Car{
    public abstract void makeTurbo();
    public void start(){
        System.out.println("Brrrrmm");
    }
}

class Ford extends Car{
    public void makeTurbo(){
        System.out.println("Stustustu");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Ford myCar = new Ford();
        myCar.makeTurbo();
        myCar.start();


    }
}
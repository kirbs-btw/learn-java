// interface

interface CarTwo{
    public void goStuStu();
    public void goBrr();
}

class Toyota implements CarTwo{
    public void goStuStu(){
        System.out.println("StuStu");
    }
    public void goBrr(){
        System.out.println("Brrrm");
    }
}

public class Interface {
    public static void main(String[] args) {
        Toyota myCar = new Toyota();
        myCar.goStuStu();
        myCar.goBrr();
    }
}

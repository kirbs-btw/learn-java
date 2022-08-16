class Animal {
    public void makeSound(){
        System.out.println("wuf");
    }
}

class Bird extends Animal {
    public void makeSound(){
        System.out.println("weee");
    }
}

class Cow extends Animal {
    public void makeSound(){
        System.out.println("reee");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myBird = new Bird();
        Animal myCow = new Cow();
        myAnimal.makeSound();
        myBird.makeSound();
        myCow.makeSound();
        
    }
}
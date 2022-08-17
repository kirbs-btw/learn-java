class Animal {
    public void makeSound(){
        System.out.println("wuf");
    }

    public int getAge() {
        return 5;
    }
}

class Bird extends Animal {
    public void makeSound(){
        System.out.println("weee");
    }

    public int getAge() {
        return 7;
    }

}

class Cow extends Animal {
    public void makeSound(){
        System.out.println("reee");
    }

    public int getAge() {
        return 35;
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

        myCow.getAge();
        
    }
}

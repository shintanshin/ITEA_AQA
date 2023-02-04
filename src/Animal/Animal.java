package Animal;

public class Animal {
    String introducing;
    int eyes;

    void eat() {
        System.out.println("Animal eats");
    }

    void drinks() {
        System.out.println("Animal drinks");
    }

    Animal(String introducing) {
        this.introducing = introducing;
        System.out.print(introducing);
    }

    Animal() {
    }

    public static void main(String[] args) {
        Animal animal = new Animal("I'm Animal");
    }
}

class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet runs and jump");
    }

    Pet(String introducing) {
        super(introducing);
    }

    Pet() {
    }

    Pet(String introducing, int eyes) {
        super(introducing);
        this.eyes = eyes;
    }

    public static void main(String[] args) {
        Animal pet = new Pet("I'm Pet", 2);
    }
}

class Dog extends Pet {


    void play() {
        System.out.println("Dog plays");
    }

    Dog() {
    }

    Dog(String introducing, String name) {
        super(introducing);
        this.name = name;
        System.out.print(name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("I'm a Dog and my name is ", "Jojo");
    }
}

class Cat extends Pet {
    void sleep() {
        System.out.println("Cat sleeps");
    }

    Cat() {
    }

    Cat(String introducing, String name) {
        super(introducing);
        this.name = name;
        System.out.print(name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("I'm a Cat and my name is ", "Fluffy");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("Dog has " + dog.paw + " paws");
        cat.sleep();
    }
}
abstract class Animal {

    // abstract method
    abstract void sound();

    // normal method
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class code42 {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.eat();
        a1.sound();

        System.out.println();

        a2.eat();
        a2.sound();
    }
}

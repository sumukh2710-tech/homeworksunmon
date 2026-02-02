class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class code36 {
    public static void main(String[] args) {

        Animal a1 = new Dog(); // parent reference, child object
        Animal a2 = new Cat();

        a1.sound();  // Dog's sound()
        a2.sound();  // Cat's sound()
    }
}

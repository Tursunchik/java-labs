class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void barking() {
        System.out.println("Barking...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.barking();
    }
}
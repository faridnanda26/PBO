package week7.antarmuka;

public class Main {
    public static void main(String[] args) {
        Duck a1 = new Duck("bebek");
        Dog a2 = new Dog("anjing");

        a1.eat();
        a2.eat();

        a1.makeSound();
        a2.makeSound();

        a1.swim();
        a1.fly();

        a2.swim();
    }
}

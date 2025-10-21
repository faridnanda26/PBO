package week7.antarmuka;

public class Dog extends Animal implements Swimable{
    Dog(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println("guk...guk");
    }

    public void swim(){
        System.out.println(getNama() + "swim");
    }
}

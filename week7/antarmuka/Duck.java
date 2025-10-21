package week7.antarmuka;

public class Duck extends Animal implements Flyable, Swimable{
    Duck(String nama){
        super(nama);
    }

    public void makeSound(){
        System.out.println("kwek...kwek");
    }

    public void fly(){
        System.out.println(getNama() + "fly");
    }

    public void swim(){
        System.out.println(getNama() + "swim");
    }
}

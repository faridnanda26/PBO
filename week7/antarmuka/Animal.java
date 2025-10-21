package week7.antarmuka;

public abstract class Animal {
    private String nama;

    Animal(String nama){
        this.nama = nama;
    }

    public abstract void makeSound();

    public void eat(){
        System.out.println(nama + "makan");
    }

    public String getNama(){
        return nama;
    }
}

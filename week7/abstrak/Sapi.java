package week7.abstrak;

public class Sapi extends Hewan{
    Sapi(String nama, int jumKaki, boolean bisaTerbang){
        super(nama, jumKaki, bisaTerbang);
    }

    public void bersuara(){
        System.out.println("MOOOOO");
    }
}

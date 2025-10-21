package week7;

public class Burung extends Hewan{
    Burung(String nama, int jumKaki, boolean bisaTerbang){
        super(nama, jumKaki, bisaTerbang);
    }

    public void bersuara(){
        System.out.println("Cuit Cuit");
    }
}

package week7;

public abstract class Hewan {
    private String nama;
    private int jumKaki;
    private boolean bisaTerbang;

    Hewan(String nama, int jumKaki, boolean bisaTerbang){
        this.nama = nama;
        this.jumKaki = jumKaki;
        this.bisaTerbang = bisaTerbang;
    }

    public void isHewan(){
        System.out.println("Hewan " + nama);
    }

    public abstract void bersuara();
}

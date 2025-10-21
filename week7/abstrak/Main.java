package week7.abstrak;

public class Main {
    public static void main(String[] args) {
        Sapi h1 = new Sapi("Sapi", 4, false);
        Burung h2 = new Burung("Burung", 2, true);

        h1.isHewan();
        h2.isHewan();

        h1.bersuara();
        h2.bersuara();
    }
}
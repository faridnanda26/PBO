package kalkulator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan angka pertama: ");
        double angkaPertama = scanner.nextDouble();
        System.out.print("Masukan angka kedua: ");
        double angkaKedua = scanner.nextDouble();
        kalkulator.kali(angkaPertama, angkaKedua);
    }
}

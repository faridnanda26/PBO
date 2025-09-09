package penilaian;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai: ");
        double nilaiAkhir = scanner.nextDouble();
        nilai.cekNilai(nilaiAkhir);
    }
}

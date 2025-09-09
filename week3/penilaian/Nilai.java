package penilaian;

public class Nilai {
    void cekNilai(double nilai){
        if(nilai < 0 || nilai > 100){
            System.out.println("masukan nilai rentang 0-100");
            return;
        }

        if(nilai >= 60){
            System.out.println("LULUS");
        }else{
            System.out.println("GAGAL");
        }

        if(nilai >= 85){
            System.out.println("Grade: A");
        }else if(nilai < 85 && nilai >= 70){
            System.out.println("Grade: B");
        }else if(nilai < 70 && nilai >= 60){
            System.out.println("Grade: C");
        }else if(nilai < 60 && nilai >= 50){
            System.out.println("Grade: D");
        }else if(nilai < 50){
            System.out.println("Grade: E");
        }
    }
}

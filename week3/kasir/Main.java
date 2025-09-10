package kasir;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListBarang barang = new ListBarang();
        ListUser user = new ListUser();

        barang.add("Teh Kotak", 5000);
        barang.add("Beng-Beng", 2000);
        barang.add("Air Mineral", 3000);
        barang.add("Japota", 12000);
        barang.add("Nescafe", 15000);
        barang.add("Chitato", 10000);
        barang.add("Indomie", 3500);
        barang.add("SilverQueen", 12500);
        barang.add("Good Day", 4000);
        barang.add("Pocari Sweat", 8000);

        while(true){
            System.out.println("+===========================+");
            System.out.println("|        MENU UTAMA         |");
            System.out.println("+===========================+");
            System.out.printf("| %-2d. %-20s |\n", 1, "Login");
            System.out.printf("| %-2d. %-20s |\n", 2, "Signin");
            System.out.printf("| %-2d. %-20s |\n", 3, "Logout");
            System.out.println("+===========================+");
            System.out.print(">>> ");
            int fitur = scanner.nextInt();
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            if(fitur == 1){
                while(true){
                    System.out.println("+===========================+");
                    System.out.println("|          LOGIN            |");
                    System.out.println("+===========================+");
                    System.out.print("| Masukan Username : ");
                    String username = scanner.next();
                    System.out.print("| Masukan Password : ");
                    String password = scanner.next();
                    System.out.println("+===========================+");

                    if(username.equals("admin") && password.equals("admin")){
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        while(true){
                            System.out.println("+===========================+");
                            System.out.println("|     INPUT DATA BARANG     |");
                            System.out.println("+===========================+");
                            System.out.print("| Nama Barang  : ");
                            String nama = scanner.next();
                            System.out.print("| Harga Barang : ");
                            int harga = scanner.nextInt();
                            System.out.println("+===========================+");

                            barang.add(nama, harga);
                            System.out.println("Berhasil menambahkan " + nama);
                            System.out.println("ketik 1 untuk kembali");
                            System.out.print(">>> ");
                            int exit = scanner.nextInt();
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            if(exit == 1) break;
                        }
                        break;
                    }
                    boolean cekLogin = user.cekLogin(username, password);
                    if(cekLogin){
                        while(true){
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            NodeUser userLogin = user.cariUser(username, password);
                            if(userLogin.barang == null){
                                ListBarang barangBelanjaan = new ListBarang();
                                userLogin.barang = barangBelanjaan;
                            }
                            System.out.println("+===========================+");
                            System.out.println("|         MENU USER         |");
                            System.out.println("+===========================+");
                            System.out.printf("| %-2d. %-20s |\n", 1, "Belanja");
                            System.out.printf("| %-2d. %-20s |\n", 2, "Bayar");
                            System.out.println("| Ketik selain 1/2 untuk   |");
                            System.out.println("| keluar dari menu          |");
                            System.out.println("+===========================+");
                            System.out.print(">>> ");

                            int pilihan2 = scanner.nextInt();
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            if(pilihan2 != 1 && pilihan2 != 2) break;

                            if(pilihan2 == 1){
                                while(true){
                                    barang.traverseAndPrint();
                                    System.out.print(">>> ");
                                    int barangKe = scanner.nextInt();
                                    NodeBarang yangDicari = barang.barangKe(barangKe);
                                    userLogin.barang.add(yangDicari.nama, yangDicari.harga);
                                    System.out.println("Ketik 'ex' untuk exit");
                                    System.out.println("Ketik 'nx' jika ingin lanjut");
                                    System.out.print(">>> ");
                                    String exit = scanner.next();
                                    System.out.print("\033[H\033[2J");  
                                    System.out.flush();
                                    if(exit.equals("ex")) break;
                                }
                            }else if(pilihan2 == 2){
                                userLogin.barang.bayar();
                                System.out.println("Ketik 'ex' untuk exit");
                                System.out.print(">>> ");
                                String pilihan = scanner.next();
                                System.out.print("\033[H\033[2J");  
                                System.out.flush();
                            }
                        }
                    }else{
                        System.out.println("Username atau Password salah");
                        System.out.println("Ketik 'nx' untuk mencoba lagi, ketik 'ex' untuk keluar");
                        System.out.print(">>> ");
                        String pilihan = scanner.next();
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        if(pilihan.equals("ex")) break;
                    }
                }
            }else if(fitur == 2){
                while(true){
                    System.out.println("+===========================+");
                    System.out.println("|        SIGNIN FORM        |");
                    System.out.println("+===========================+");
                    System.out.print("| Masukan Username : ");
                    String username = scanner.next();
                    System.out.print("| Masukan Password : ");
                    String password = scanner.next();
                    System.out.println("+===========================+");
                    boolean cekUsername = user.cekUsername(username);

                    if(cekUsername){
                        System.out.println("Username sudah digunakan");
                        System.out.println("Ketik 'nx' untuk mencoba lagi, ketik 'ex' untuk keluar");
                    }else{
                        user.add(username, password);
                        System.out.println("Berhasil Signin");
                        System.out.println("ketik 'ex' untuk keluar");
                    }
                    System.out.print(">>> ");
                    String pilihan = scanner.next();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    if(pilihan.equals("ex")) break;
                }
            }else if(fitur == 3){
                break;
            }else{
                System.out.println("=================================");
                System.out.println("= Masukan Pilihan Yang Tersedia =");
                System.out.println("=================================");
                System.out.println();
            }
        }
    }
}
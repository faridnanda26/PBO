package kasir;

public class ListBarang {
    NodeBarang head = null, tail = null;

    void add(String nama, int harga){
        NodeBarang newNode = new NodeBarang(nama, harga);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void traverseAndPrint() {
        if(head == null){
            System.out.println("Belum Ada Barang");
            return;
        }
        System.out.println("+--------------------------------+");
        System.out.println("|          LIST BARANG           |");
        System.out.println("+----+-----------------+---------+");
        System.out.printf("| %-2s | %-15s | %-7s |\n", "No", "Nama", "Harga");
        System.out.println("+----+-----------------+---------+");

        NodeBarang current = head;
        int i = 1;
        while (current != null) {
            System.out.printf("| %-2d | %-15s | %-7d |\n", i, current.nama, current.harga);
            i++;
            current = current.next;
        }

        System.out.println("+----+-----------------+---------+");
    }

    NodeBarang barangKe(int i){
        NodeBarang yangDicari = null;
        NodeBarang current = head;
        for(int j = 0; j < i; j++){
            yangDicari = current;
            current = current.next;
        }
        return yangDicari;
    }

    void bayar(){
        if(head == null){
            System.out.println("Belum ada barang ditambahkan ke keranjang");
            return;
        }
        traverseAndPrint();
        int total = 0;
        NodeBarang current = head;
        while(current != null){
            total += current.harga;
            current = current.next;
        }
        System.out.println("Total: Rp." + total);
        System.out.println("+----+-----------------+---------+");
        System.out.println("Pembayaran Berhasil");
        head = null;
    }
}
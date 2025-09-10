package kasir;

public class NodeBarang {
    NodeBarang next, prev;
    String nama;
    int harga;
    
    NodeBarang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
        this.next = null;
        this.prev = null;
    }
}

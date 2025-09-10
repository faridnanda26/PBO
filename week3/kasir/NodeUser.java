package kasir;

public class NodeUser {
    NodeUser next, prev;
    String username, password;
    int totalBelanja;
    ListBarang barang;
    
    NodeUser(String username, String password){
        this.username = username;
        this.password = password;
        this.next = null;
        this.prev = null;
    }
}

package kasir;

public class ListUser {
    NodeUser head = null, tail = null;

    void add(String username, String password){
        NodeUser newNode = new NodeUser(username, password);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    boolean cekUsername(String username){
        NodeUser current = head;
        boolean akunTerdaftar = false;
        while(current != null){
            if(current.username.equals(username)){
                akunTerdaftar = true;
                break;
            }
            current = current.next;
        }
        return akunTerdaftar;
    }

    boolean cekLogin(String username, String password){
        NodeUser current = head;
        boolean akunTerdaftar = false;
        while(current != null){
            if(current.username.equals(username) && current.password.equals(password)){
                akunTerdaftar = true;
                break;
            }
            current = current.next;
        }
        return akunTerdaftar;
    }

    NodeUser cariUser(String username, String password){
        NodeUser current = head;
        NodeUser yangDicari = null;
        while(current != null){
            if(current.username.equals(username) && current.password.equals(password)){
                yangDicari = current;
                break;
            }
            current = current.next;
        }
        return yangDicari;
    }
}

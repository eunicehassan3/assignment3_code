public class DLList {
    DLNode head;
    int size;

    DLList(){
        head = null;
    }

    public void listAdd(Book p) {
        DLNode newNode = new DLNode(p);

        if (head == null) {
            head = newNode;
        } else {
            DLNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        size++;
    }

    public void listRemove(int pos){
        if (pos < 0 || pos >= size) { //if pos is out of bounds
            return;
        }

        if (size == 1) {  //if there is only one node in the list
            head = null;
        } else if (pos == 0) {
            head = head.next;
            head.prev = null;
       } else {
            DLNode current = head;
            for (int i = 0; i < pos; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
        size--;
    }

    public String toString(){
        String res = "";
        DLNode temp = head;
        while(temp != null){
            res += temp.data + "\n";
            temp = temp.next;
        }
        return res;
    }
}


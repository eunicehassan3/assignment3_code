public class DLList {
    DLNode head;
    DLNode tail;
    int size;

    DLList(){
        head = null;
        tail = null;
    }

    public void listAdd(Book p){
        DLNode newNode = new DLNode(p);
        if(tail != null){
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null){
            head = newNode;
        }
        size++;

    }

    public void listRemove(int pos){
        DLNode current = head;
        if(head == null){
            return;
        }
        // || pos >= size

        for(int i = 0; current != null && i < pos; i++){
            current = current.next;
        }
        //pos > size;
        if(current == null){
            return;
        }

        //if there is only one node in the list
        if(current == head && current == tail){
            head = null;
            tail = null;
        }
        //
        if (current == head) {
            head = current.next;
            head.prev = null;
        } else if (current == tail) {
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
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


public class DLListGeneric<T> {
    DLNode head;
    DLNode tail;
    int size;

    DLListGeneric(){
        head = null;
        tail = null;
    }

    public void listAdd(T p){
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
        DLNode current;

        if(head == null){
            return;
        }
        if(pos == 0){
            head = head.next;
            if(head != null){
                head.prev = null; //"delete" the beginning node
            }
            return;
        }

        current = head;
        for(int i = 0; current != null && i < pos; i++){
            current = current.next;
        }
        if(current == null) return; //position out of bounds
        if(current.prev != null){
            current.prev.next = current.next; //update pointers to remove the current node
        }
        if(current.next != null){
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

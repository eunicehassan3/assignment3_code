public class DLList {
    DLNode head;
    DLNode tail;

    DLList(){
        head = null;
        tail = null;
    }

    public void listAdd(Book p){
        DLNode newNode = new DLNode(p);
        if(head.next == null){
            head = newNode;
        }
        else if(tail.next == null){
            tail = newNode;
        }
        else{
            tail.next = newNode;
        }
    }

    public void listRemove(int position){
        DLNode current = new DLNode(new Book());

        if(head == null){
            return;
        }

        for(int i = 0; i < position; i++){
            current  = current.next;
        }
        DLNode previous = current.prev;
        previous.next = current.next;
        current.next.prev = current.prev;
    }

    public String toString(){
        String res = "";
        while(head != null){
            res += head.data + "\n";
            head = head.next;
        }
        return res;
    }
}


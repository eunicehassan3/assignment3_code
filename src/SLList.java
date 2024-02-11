public class SLList {
    SLNode head = null;
    int size = 0;

    SLList(){}

    public void listAdd(Book p) {
        SLNode newNode = new SLNode(p);
        SLNode last = head;
        if (head == null) {
            head = newNode;
            size++;
        } else {
            while (last != null) {
                last = last.next;
                size++;
            }
        }
        last.next = newNode;
    }
    public void  listRemove(int pos){
        SLNode prev = new SLNode(new Book());
        while(pos > size){
            return;
        }
        for(int i = 0; i < pos; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
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


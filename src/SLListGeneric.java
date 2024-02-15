public class SLListGeneric<T> {
    SLNode head = null;
    int size = 0;

    SLListGeneric(){}

    public void listAdd(T p) {
        SLNode newNode = new SLNode(p);
        SLNode last = head;
        if (head == null) {
            head = newNode;
            size++;
            return;
        } else {
            while (last.next != null) {
                last = last.next;
                size++;
            }
        }
        last.next = newNode;
    }
    public void  listRemove(int pos){
        SLNode temp = head;
        if(head == null || pos > size){ // if list is empty or pos > size
            return;
        }
        if(pos == 0){ // if your deleting the head
            head = temp.next; // then just change the head to next value
            return;
        }
        for(int i = 0; temp != null &&  i < pos - 1; i++){ // iterate to fine the prev value of pos
            temp = temp.next;
        }
        temp.next = temp.next.next;  // prev should point to current.next node

    }


    public String toString(){
        String res = "";
        SLNode temp = head;
        while(temp != null){
            res += temp.data + "\n";
            temp = temp.next;
        }
        return res;
    }
}

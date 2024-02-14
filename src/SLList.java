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
        if(head == null){ //if list is empty
            return;
        }
        if(pos == 0){ //if your deleting the head
            head = temp.next; //then just change the head to next value
            return;
        }
        for(int i = 0; temp != null &&  i < pos - 1; i++){ //iterate to fine the prev value of pos
            temp = temp.next;
        }
        if (temp == null || temp.next == null){ //if pos is more than the number of nodes
            return;
        }
        temp.next = temp.next.next;  //prev should point to current.next node

    }
//        SLNode prev = new SLNode(new Book());
//        while(pos > size){
//            return;
//        }
//        for(int i = 0; i < pos; i++){
//            prev = prev.next;
//        }
//        prev.next = prev.next.next;
//    }

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


public class DLNode<T> {
    T data;
    DLNode prev;
    DLNode next;

    DLNode(T d){
        data = d;
        prev = null;
        next = null;
    }

}

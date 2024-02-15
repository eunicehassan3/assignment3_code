public class AListGeneric<T> {
    private int size= 0;
    private int maxSize = 0;
    private T[] arr = (T[]) new Object [maxSize];
    AListGeneric(){}

    public void listAdd(T p){
        if(size < maxSize){
            arr[size] = p; //add value
            size++; // increase size
        }
        else{
            maxSize += 1;
            maxSize *= 2;
            T[] temp = (T[]) new Object [maxSize]; //make a new array with bigger length
            for(int i = 0; i < arr.length; i++){ //copy everything into new array
                temp[i] = arr[i];
            }
            temp[size] = p; //add value
            arr = temp;
            size++; //increase size

        }
    }

    public void listRemove(int pos){
        //make sure index is in bounds
        if(pos < 0 || pos >= size){
            return;
        }
        for(int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

    }

    public String toString(){
        String res = "";
        for(int i = 0; i < size; i++){
            res += arr[i] + "\n";
        }
        return res;
    }
}

public class AList {
    private int size= 0;
    private int maxSize = 0;
    private Book[] arr = new Book[maxSize];
    AList(){}

    public void listAdd(Book p){
        if(size < maxSize){
            arr[size] = p; //add value
            size++; // increase size
        }
        else{
            maxSize += 1;
            Book[] temp = new Book[maxSize]; //make a new array with bigger length
            for(int i = 0; i < arr.length; i++){ //copy everything into new array
                temp[i] = arr[i];
            }
            temp[arr.length] = p; //add value
            arr = temp;
            size++; //increase size

        }
    }

    public void listRemove(int pos){
        for(int i = pos; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
            size --;
        }
    }

    public String toString(){
        String res = "";
        for(int i = 0; i < arr.length; i++){
            res += arr[i] + "\n";
        }
        return res;
    }
}

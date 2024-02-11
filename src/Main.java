public class Main {
    public static void main(String[] args) {
        AList bookArray = new AList();
        SLList bookList = new SLList();
        Book book1 = new Book("Black Clover", "Yiji", 20.45);
        Book book2 = new Book("Sky Kiss", "Goendo", 23.21);
        Book book3 = new Book("Never Let Me Go", "Findland", 15.44);

        System.out.println(bookArray.toString());
        bookArray.listAdd(book1);
        bookArray.listAdd(book3);
        bookArray.listAdd(book2);
        System.out.println(bookArray.toString());
        bookArray.listRemove(1);
        System.out.println(bookArray.toString());

        System.out.println(bookList.toString());
    }
}
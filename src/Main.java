public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AList bookArray = new AList();
        SLList bookList = new SLList();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        System.out.println(bookArray.toString());
        bookArray.listAdd(book1);
        bookArray.listAdd(book3);
        bookArray.listAdd(book2);
        System.out.println(bookArray.toString());
        bookArray.listRemove(1);
        System.out.println(bookArray.toString());
    }
}
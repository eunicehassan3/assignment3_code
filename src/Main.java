public class Main {
    public static void main(String[] args) {
        AList bookArray = new AList();
        SLList bookList = new SLList();
        DLList dBookList = new DLList();
        AListGeneric genericArray = new AListGeneric<>();
        SLListGeneric genericSLList = new SLListGeneric<>();
        DLListGeneric genericDLList = new DLListGeneric<>();
        Book book1 = new Book("Black Clover", "Yiji", 20.45);
        Book book2 = new Book("Sky Kiss", "Goendo", 23.21);
        Book book3 = new Book("Never Let Me Go", "Findland", 15.44);
        String name1 = "Maxwell";
        String name2 = "Lovell";
        String name3 = "Dustin";


        System.out.println(bookArray.toString());
        bookArray.listAdd(book1);
        bookArray.listAdd(book3);
        bookArray.listAdd(book2);
        System.out.println(bookArray.toString());
        bookArray.listRemove(5);
        System.out.println(bookArray.toString());

        System.out.println(bookList.toString());
        bookList.listAdd(book3);
        bookList.listAdd(book2);
        bookList.listAdd(book1);
        System.out.println(bookList.toString());
        bookList.listRemove(1);
        System.out.println(bookList.toString());

//        System.out.println(dBookList.toString());
//        dBookList.listAdd(book3);
//        dBookList.listAdd(book2);
//        dBookList.listAdd(book1);
//        System.out.println(dBookList.toString());
//        dBookList.listRemove(1);
//        System.out.println(dBookList.toString());

        System.out.println(genericArray.toString());
        genericArray.listAdd(name2);
        genericArray.listAdd(name3);
        genericArray.listAdd(name1);
        System.out.println(genericArray.toString());
        genericArray.listRemove(1);
        System.out.println(genericArray.toString());

        System.out.println(genericSLList.toString());
        genericSLList.listAdd(name2);
        genericSLList.listAdd(name3);
        genericSLList.listAdd(name1);
        System.out.println(genericSLList.toString());
        genericSLList.listRemove(2);
        System.out.println(genericSLList.toString());

        System.out.println(genericDLList.toString());
        genericDLList.listAdd(name2);
        genericDLList.listAdd(name3);
        genericDLList.listAdd(name1);
        System.out.println(genericDLList.toString());
        genericDLList.listRemove(2);
        System.out.println(genericDLList.toString());
    }
}
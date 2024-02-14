public class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(){
    }

    @Override
    public String toString(){
        return "title: " + title + ", author: " + author + ", price: " + price;
    }

}

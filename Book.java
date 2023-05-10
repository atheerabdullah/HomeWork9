public class Book extends Product {
    private String author;


    // constructor


    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    // abstract
    @Override
    void displayIngo() {
        System.out.println(" the name of book is :" + getName());
        System.out.println(" the price is  :" + getPrice());
        System.out.println(" the price after discount : ");
    }

    // getter and setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


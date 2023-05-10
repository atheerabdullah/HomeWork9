public class Movie extends Product {
    private String director;

    // constructor
    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    // getter and setter
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    void displayIngo() {

        System.out.println("the name of movie" + getName());
        System.out.println(" the price is :" + getPrice());
        System.out.println(" the price after discount : ");


    }

}


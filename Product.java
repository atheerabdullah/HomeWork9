public abstract class  Product {
    private String name;
    private double price;


    //constructor
    public Product(String name, double price) {
        this.price=price;
        this.name=name;
    }

    // abstract
    abstract void displayIngo();




    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getDiscountable(double percentage) {
        double discountAmount = getPrice() * (percentage / 100);
        double discountedPrice = getPrice() - discountAmount;
        setPrice(discountedPrice);
    }

}

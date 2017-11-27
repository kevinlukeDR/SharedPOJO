package POJO;

public enum FoodsEnum {
    BURGERS("Burgers", 5.50), CHICHENS("Chickens", 6.00),
    FRENCHFRIES("French Fries", 2.00), ONIONRINGS("Onion Rings", 2.50);
    // Variables
    private String name;
    private double price;

    // Constructor
    private FoodsEnum(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter & Setter
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

}
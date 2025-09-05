package codegym.strategy_example;

public class Product implements Comparable<Product> {
    private String serial;
    private String productName;
    private double price;

    public Product(String serial, String productName, double price) {
        this.serial = serial;
        this.productName = productName;
        this.price = price;
    }

    /* Hai sản phẩm so sánh với nhau theo giá bán */
    @Override
    public int compareTo(Product o) {
        if (o == null || this.price > o.price) {
            return 1;
        }
        if (this.price < o.price) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return serial + " – " + productName;
    }
}

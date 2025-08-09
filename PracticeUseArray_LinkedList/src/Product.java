public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;
    private static int countProduct = 0;

    public Product() {
    }

    public Product( String name, double price) {
        this.id = ++countProduct;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.getName());
    }
}

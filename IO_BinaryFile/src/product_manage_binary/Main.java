package product_manage_binary;

import read_write_binary.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_PATH = "src/product_manage_binary/product.csv";

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        // Thêm product
        Product p1 = new Product(1, "phone", 1000, "test", "test");
        Product p2 = new Product(2, "tv", 1000, "test", "test");
        products.add(p1);
        products.add(p2);
        writeProductToFile(FILE_PATH, products);
        List<Product> productDataFromFile = getProducts(FILE_PATH);
        for (Product p : productDataFromFile) {
            System.out.println(p);
        }
        System.out.println("Result after search: ");

        // tìm product có name "phone"
        String nameSearch = "phone";
        Product result = productDataFromFile.stream().filter(p -> p.getName().equals(nameSearch)).findFirst().orElse(null);
        System.out.println(result);
    }

    public static void writeProductToFile(String filePath, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> getProducts(String filePath) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}

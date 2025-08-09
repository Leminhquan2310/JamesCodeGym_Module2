import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    public List<Product> listProducts;

    public ProductManager() {
        listProducts = new ArrayList<>();
    }

    public void addProduct (Product product) {
        listProducts.add(product);
    }
    public void updateProduct (int id, Product product) {
        int index = findIndexById(id);
        if (index == -1) {System.out.println("Sản phẩm không tồn tại!"); return;}
        listProducts.set(index, product);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < listProducts.size(); i++){
            if (listProducts.get(i).getId() == id) return i;
        }
        return -1;
    }

    public void deleteProduct (int id) {
        int index = findIndexById(id);
        if (index == -1) {System.out.println("Sản phẩm không tồn tại!"); return;}
        listProducts.remove(index);
    }

    public Product getProductById (int id) {
        int index = findIndexById(id);
        return listProducts.get(index);
    }

    public void arrangeByName () {
        Collections.sort(listProducts);
    }
}

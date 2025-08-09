import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product pro1 = new Product("Iphone", 300);
        Product pro2 = new Product("Nokia", 300);
        Product pro3 = new Product("Samsung", 300);
        Product pro4 = new Product("Oppo", 300);
        Product pro5 = new Product("Vivo", 300);
        ProductManager manager = new ProductManager();
        manager.addProduct(pro1);
        manager.addProduct(pro2);
        manager.addProduct(pro3);
        manager.addProduct(pro4);
        manager.addProduct(pro5);
        System.out.println("List product original");
        display(manager.listProducts);

        pro2.setName("Nokia Lumia");
        manager.updateProduct(2, pro2);
        System.out.println("List product after update at id 2");
        display(manager.listProducts);

        manager.deleteProduct(5);
        System.out.println("List product after delete id 5");
        display(manager.listProducts);

        Product proSearch = manager.getProductById(4);
        System.out.println("Product search by id 4: " + proSearch);

        manager.arrangeByName();
        System.out.println("List after sort by name:");
        display(manager.listProducts);
    }

    public static void display (List<Product> list) {
        System.out.println("------- List Products --------");
        for (Product pro : list) {
            System.out.println(pro);
        }
        System.out.println("------- --------------- --------");
    }
}
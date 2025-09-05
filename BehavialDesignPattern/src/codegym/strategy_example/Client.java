package codegym.strategy_example;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
    public static void compare(ArrayList list) {
        if (list != null && list.size() > 0) {
            Collections.sort(list);
            for (Object obj : list) {
                System.out.println(" + " + obj);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("A01234", "Minh Le Hoang", 12.5));
        students.add(new Student("A01235", "An Nguyen Van", 15.5));
        students.add(new Student("A01235", "Tuan Nguyen Anh", 13.5));
        students.add(new Student("A01235", "Ha Le Hoang", 17.5));

        System.out.println("Sap xep sinh vien: ");
        //Hệ thống sẽ dùng phương thức compareTo() của lớp Student để so sánh các đối tượng Sinh viên:
        Client.compare(students);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("P0023", "Dell Vostro 3400", 1200));
        products.add(new Product("P0012", "IBM Thinpad T60", 1100));
        products.add(new Product("P0003", "Vaio Z", 3000));
        products.add(new Product("P0303", "HP Pavilon", 1230));

        System.out.println("Sap xep san pham: ");
        //Hệ thống sẽ dùng phương thức compareTo() của lớp Product để so sánh các đối tượng sản phẩm với nhau:
        Client.compare(products);
    }
}

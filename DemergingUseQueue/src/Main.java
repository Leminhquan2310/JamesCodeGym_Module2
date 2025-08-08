import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person[] peoples = {
                new Person("Quân", "Male", LocalDate.of(2002, 1, 23)),
                new Person("Nhi", "Female", LocalDate.of(2002, 6, 23)),
                new Person("Xuân", "Female", LocalDate.of(2002, 8, 23)),
                new Person("Hương", "Female", LocalDate.of(2002, 10, 23)),
                new Person("Minh", "Male", LocalDate.of(2002, 2, 23)),
                new Person("Hạ", "Female", LocalDate.of(2002, 12, 23)),
                new Person("Hoàng", "Male", LocalDate.of(2002, 8, 23)),
                new Person("Nhật", "Male", LocalDate.of(2002, 10, 23))
        };

        Queue<Person> Nu = new LinkedList<>();
        Queue<Person> Nam = new LinkedList<>();

        for (Person p : peoples) {
            if (p.getGender().equals("Female")) {
                Nu.add(p);
            } else {
                Nam.add(p);
            }
        }

        for (int i = 0; i < peoples.length; i++) {
            peoples[i] = Nu.isEmpty() ? Nam.poll() : Nu.poll();
        }

        for (Person person : peoples) {
            System.out.println(person);
        }
    }
}
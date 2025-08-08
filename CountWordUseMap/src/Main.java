import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String sentence = "Hello i am a new bie study java";
        Map<String, Integer> myMap = new HashMap<>();

        for (String s : sentence.replaceAll("\\s+", "").split("")) {
            String item = s.toLowerCase();
            myMap.put(item, myMap.getOrDefault(item, 0) + 1);
        }

        Set<String> keys = myMap.keySet();

        for (String key : keys) {
            System.out.println("Kí tự " + key + " xuất hiện " + myMap.get(key) + " lần");
        }
    }
}
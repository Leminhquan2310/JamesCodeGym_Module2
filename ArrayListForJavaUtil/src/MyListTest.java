public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.remove(2);

        System.out.println("Get size: " + myList.size());

        printArray(myList);

    }

    public static void printArray (MyList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

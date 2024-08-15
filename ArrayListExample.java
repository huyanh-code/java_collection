import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        addArrayList();
    }
    static void addArrayList(){
        ArrayList<String> fruit = new ArrayList<>();

        fruit.add("banana");
        fruit.add("mango");
        fruit.add("watermelon");
        fruit.add("lemon");
        fruit.add("apple");

        // Print array Fruits.
        System.out.println("Fruit: " + fruit);

        // Print array Fruits after.
        fruit.set(2, "dragon fruits");
        System.out.println("Fruits after: " + fruit);

        // Print array Fruits check.
        boolean check = fruit.contains("banana");
        System.out.println("Fruits check: " + check);

        //Print array Fruits add.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Cherry");
        fruits.add("Grape");
        fruit.addAll(fruits);
        // Print array Fruit add.
        System.out.println("Fruits add: " + fruit);

        //Print fruit remove.
        fruit.remove(3);
        System.out.println("Remove: " + fruit);

        //Print fruit reverse.
        Collections.reverse(fruit);
        System.out.println("Element reversing: " + fruit );

        List<String> fr = fruit.subList(2,4);
        System.out.println("Sublist fruits: " + fr);
    }
}
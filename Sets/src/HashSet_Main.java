import java.util.HashSet;

public class HashSet_Main {
    public static void main(String[] args) {

  HashSet<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("banana");
        fruits.add("date");

        System.out.println(fruits);

        System.out.println(fruits.contains("cherry"));

    }
}

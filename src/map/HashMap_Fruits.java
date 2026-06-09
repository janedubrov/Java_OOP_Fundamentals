package map;

import java.util.HashMap;

public class HashMap_Fruits {
    public static void main(String[] args) {

        HashMap<String, Integer> fruits = new HashMap<>();

        String text = "apple, banana, apple, cherry, banana, apple, date, cherry, apple";
        String[] words = text.split(", ");

        for (String word : words) {
            fruits.put(word, fruits.getOrDefault(word, 0) + 1);

        }System.out.println(fruits);

    }
}

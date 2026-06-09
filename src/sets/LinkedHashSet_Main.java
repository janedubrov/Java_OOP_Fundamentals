package sets;

import java.util.LinkedHashSet;

public class LinkedHashSet_Main {
    public static void main(String[] args) {

        LinkedHashSet<String> pages = new LinkedHashSet<>();

        pages.add("home");
        pages.add("about");
        pages.add("shop");
        pages.add("home");
        pages.add("contact");
        pages.add("shop");

        System.out.println(pages);

    }
}

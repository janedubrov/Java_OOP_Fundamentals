package sets;

import java.util.TreeSet;

public class TreeSet_Main {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(78);
        nums.add(98);
        nums.add(95);
        nums.add(78);
        nums.add(35);
        nums.add(54);
        nums.add(78);

        System.out.println(nums);

        System.out.println(nums.first());
        System.out.println(nums.last());
    }
}

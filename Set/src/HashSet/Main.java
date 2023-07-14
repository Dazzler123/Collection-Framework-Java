package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        hashset.add("Dazzler");
        hashset.add("Marky");
        hashset.add("Abby");

        System.out.println(hashset.contains("Dazzler"));

        System.out.println(hashset);
    }
}
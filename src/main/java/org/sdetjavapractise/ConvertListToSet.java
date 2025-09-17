package org.sdetjavapractise;

import java.util.*;

public class ConvertListToSet {
    public static void main(String[] args) {
        // Create a List with duplicates
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        System.out.println("Original List: " + names);

        // Convert List to Set (removes duplicates)
        Set<String> set = new HashSet<>(names);

        System.out.println("Converted Set: " + set);
    }
}

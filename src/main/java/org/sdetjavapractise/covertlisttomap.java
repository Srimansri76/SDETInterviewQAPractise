package org.sdetjavapractise;

public class covertlisttomap {

    public static void main (String[] args){

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        java.util.Map<Integer, String> map = new java.util.HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(i, names[i]);
        }

        System.out.println("Converted Map: " + map);

    }
}

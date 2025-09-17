package org.sdetjavapractise;

public class anagramarenot {

    public static void main (String[] args){
        String str1 = "ram";
        String str2 = "shiva";

        //vlaid test data
        //listen , silent


        // Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
            return;
        }

        // Create frequency arrays for each character ( instead we can use array char compare too)
        int[] charCount = new int[26]; // Assuming only lowercase a-z

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
                return;
            }
        }

        System.out.println(str1 + " and " + str2 + " are anagrams.");
    }
}



//
//import java.util.Arrays;
//
//public class AnagramCheck {
//    public static void main(String[] args) {
//        String str1 = "shivam";
//        String str2 = "vamshi";
//
//        // Remove spaces and make lowercase
//        str1 = str1.replaceAll("\\s", "").toLowerCase();
//        str2 = str2.replaceAll("\\s", "").toLowerCase();
//
//        // If lengths are different, not anagrams
//        if (str1.length() != str2.length()) {
//            System.out.println(str1 + " and " + str2 + " are not anagrams.");
//            return;
//        }
//
//        // Convert to char arrays
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//
//        // Sort both arrays
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        // Compare
//        if (Arrays.equals(arr1, arr2)) {
//            System.out.println(str1 + " and " + str2 + " are anagrams.");
//        } else {
//            System.out.println(str1 + " and " + str2 + " are not anagrams.");
//        }
//    }
//}








/// ///HASHMAP APPROACH
//
//package org.sdetjavapractise;
//
//import java.util.HashMap;
//
//public class AnagramWithHashMap {
//    public static void main(String[] args) {
//        String str1 = "shivam";
//        String str2 = "vamshi";
//
//        // Normalize
//        str1 = str1.replaceAll("\\s", "").toLowerCase();
//        str2 = str2.replaceAll("\\s", "").toLowerCase();
//
//        // If lengths differ, not anagrams
//        if (str1.length() != str2.length()) {
//            System.out.println(str1 + " and " + str2 + " are not anagrams.");
//            return;
//        }
//
//        // Create HashMap for counts
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        // Count chars in str1
//        for (char c : str1.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        // Decrease counts using str2
//        for (char c : str2.toCharArray()) {
//            if (!map.containsKey(c)) {
//                System.out.println(str1 + " and " + str2 + " are not anagrams.");
//                return;
//            }
//            map.put(c, map.get(c) - 1);
//        }
//
//        // Verify all counts are zero
//        for (int count : map.values()) {
//            if (count != 0) {
//                System.out.println(str1 + " and " + str2 + " are not anagrams.");
//                return;
//            }
//        }
//
//        System.out.println(str1 + " and " + str2 + " are anagrams.");
//    }
//}

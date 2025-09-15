package org.sdetjavapractise;

public class findinglength {

    public static void main (String[] args){
        String name = "SDET Java Practise 123 @#!";

        // Normal length
        System.out.println("Total length: " + name.length());

        // Only characters (A-Z, a-z)
        String onlyChars = name.replaceAll("[^A-Za-z]", "");
        System.out.println("Only characters length: " + onlyChars.length());

        // Only numbers (0-9)
        String onlyNumbers = name.replaceAll("[^0-9]", "");
        System.out.println("Only numbers length: " + onlyNumbers.length());

        // Only spaces
        String onlySpaces = name.replaceAll("[^ ]", "");
        System.out.println("Only spaces length: " + onlySpaces.length());

        // Only special characters (not letters, not numbers, not spaces)
        String onlySpecials = name.replaceAll("[A-Za-z0-9 ]", "");
        System.out.println("Only special characters length: " + onlySpecials.length());

        // ------------------ COMBINATIONS ------------------

        // Characters + Numbers
        String charsAndNumbers = name.replaceAll("[^A-Za-z0-9]", "");
        System.out.println("Characters + Numbers length: " + charsAndNumbers.length());

        // Characters + Special characters
        String charsAndSpecials = name.replaceAll("[^A-Za-z@#!$%^&*()\\-+=]", "");
        System.out.println("Characters + Special characters length: " + charsAndSpecials.length());

        // Numbers + Spaces
        String numbersAndSpaces = name.replaceAll("[^0-9 ]", "");
        System.out.println("Numbers + Spaces length: " + numbersAndSpaces.length());

        // Numbers + Special characters
        String numbersAndSpecials = name.replaceAll("[^0-9@#!$%^&*()\\-+=]", "");
        System.out.println("Numbers + Special characters length: " + numbersAndSpecials.length());

        // Spaces + Special characters
        String spacesAndSpecials = name.replaceAll("[A-Za-z0-9]", "");
        System.out.println("Spaces + Special characters length: " + spacesAndSpecials.length());
    }
}



// Indirect way to find length without using length() method



//public class StringLengthWithoutLength {
//    public static void main(String[] args) {
//        String str = "SDET Java";
//
//        int count = 0;
//        try {
//            while (true) {
//                str.charAt(count); // try accessing each index
//                count++;
//            }
//        } catch (Exception e) {
//            // When index goes out of bound, loop stops
//        }
//
//        System.out.println("Length of string is: " + count);
//    }
//}



// Another way to find length using length() method

//public class StringLengthWithoutLength {
//    public static void main(String[] args) {
//        String str = "SDET Java";
//
//        // Convert string to char array
//        char[] charArray = str.toCharArray();
//
//        int count = 0;
//        for (char c : charArray) {
//            count++;   // increment for each character
//        }
//
//        System.out.println("Length of string is: " + count);
//    }
//}

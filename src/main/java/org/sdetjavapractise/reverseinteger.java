package org.sdetjavapractise;

public class reverseinteger{


//direct reverse using stringbuilder

        public static void main(String[] args) {
            int num = 12345;

            // Convert number to string and reverse
            String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();

            System.out.println("Original Number: " + num);
            System.out.println("Reversed (as String): " + reversed);

            // If you want it back as integer
            int reversedNum = Integer.parseInt(reversed);
            System.out.println("Reversed (as Integer): " + reversedNum);
        }
    }

//public class reverseinteger{

//Reverse using math operations

//    public static void main(String[] args) {
//        int num = 12345;
//        int reversed = 0;
//
//        while (num != 0) {
//            int digit = num % 10;            // get last digit
//            reversed = reversed * 10 + digit; // append digit
//            num = num / 10;                  // remove last digit
//        }
//
//        System.out.println("Reversed Number: " + reversed);
//    }
//}

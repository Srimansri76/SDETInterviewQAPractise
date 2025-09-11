package org.sdetjavapractise;

public class findingfactorial {


    public static void main(String[] args) {
        int number = 5; // Number to find the factorial of
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial* i; // Multiply factorial by i
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

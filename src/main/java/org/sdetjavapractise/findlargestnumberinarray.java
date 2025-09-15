package org.sdetjavapractise;

public class findlargestnumberinarray {

    public static void main (String[] args){
        int[] arr = {10, 20, 700, 40, 30};
        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
}

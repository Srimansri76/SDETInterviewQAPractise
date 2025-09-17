package org.sdetjavapractise;

public class getminandmaxfromlist {

    public static void main (String[] args){
        int[] arr = {10, 20, 700, 40, 30};
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The minimum number in the array is: " + min);
        System.out.println("The maximum number in the array is: " + max);
    }
}

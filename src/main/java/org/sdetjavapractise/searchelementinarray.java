package org.sdetjavapractise;

public class searchelementinarray {

    public static void main (String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " is found in the array.");
        } else {
            System.out.println("Element " + target + " is not found in the array.");
        }
    }
}

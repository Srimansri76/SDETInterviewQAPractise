package org.sdetjavapractise;

public class ArrayReverse {
        public static void main(String[] args) {
            // Direct input (hardcoded array)
            int[] arr = {1, 2, 3, 4, 5};

            // Reverse the array in-place using swapping
            int start = 0, end = arr.length - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            // Print reversed array
            System.out.print("Reversed Array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }



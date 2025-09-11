package org.sdetjavapractise;

public class arrayascendingdescending {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        // Ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();






        // Descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in Descending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

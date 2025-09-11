package org.sdetjavapractise;

import java.util.*;

public class maximumsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Kadane’s Algorithm
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < n; i++) {
            // Either extend the previous subarray or start fresh at arr[i]
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

            // Update the best answer so far
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        // Output
        System.out.println("Maximum subarray sum = " + maxSoFar);

        sc.close();
    }
}


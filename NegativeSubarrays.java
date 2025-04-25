package com.codes;

import java.util.Scanner;

public class NegativeSubarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of elements
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int negativeCount = 0;

        // Iterate over all possible subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum < 0) {
                    negativeCount++;
                }
            }
        }

        // Output the result
        System.out.println(negativeCount);
    }
}
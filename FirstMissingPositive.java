package com.codes;


public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = { 4,-1, 1,2,3}; // Change input here
        System.out.println("First missing positive: " + firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Put each number in its right place (i.e., nums[i] = i+1)
        for (int i = 0; i < n; i++) {
            while (
                nums[i] > 0 && 
                nums[i] <= n && 
                nums[nums[i] - 1] != nums[i]
            ) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Step 2: Find the first place where index doesn't match value
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positions are correct, the missing number is n + 1
        return n + 1;
    }
}
/*
Time Complexity: O(n)
Each element is swapped at most once.
The loop runs in linear time.

Space Complexity: O(1)
No extra data structures are used.
The algorithm modifies the input array in-place
*/
package com.codes;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
    
	    public static void main(String[] args) {
	        // Sample input
	        int[] nums = {2, 7, 11, 15};
	        int target = 9;

	        // Create object of Solution class
	        TwoSum sol = new TwoSum();
	        int[] result = sol.twoSum(nums, target);

	        // Print the result
	        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	    }
	}

	// Your Solution class
	

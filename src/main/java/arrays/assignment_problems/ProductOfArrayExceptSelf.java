package main.java.arrays.assignment_problems;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        // Forward pass
        int leftProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }

        // Backward pass
        int rightProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4};

        System.out.println(
                Arrays.toString(productExceptSelf(nums1))
        );

        int[] nums2 = {-1, 1, 0, -3, 3};

        System.out.println(
                Arrays.toString(productExceptSelf(nums2))
        );
    }
}

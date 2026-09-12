package main.java.arrays.assignment_problems;


import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        // Empty prefix
        prefixSumCount.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            currentSum = currentSum + num;

            int requiredSum = currentSum - k;

            if (prefixSumCount.containsKey(requiredSum)) {
                count = count + prefixSumCount.get(requiredSum);
            }

            prefixSumCount.put(
                    currentSum,
                    prefixSumCount.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 1};
        int k1 = 2;

        System.out.println(subarraySum(nums1, k1));

        int[] nums2 = {1, -1, 0};
        int k2 = 0;

        System.out.println(subarraySum(nums2, k2));
    }
}
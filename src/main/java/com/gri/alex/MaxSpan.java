package com.gri.alex;

/**
 * User: Alex
 * Date: 6-Jun-18
 */
public class MaxSpan {

    /**
     * Consider the leftmost and righmost appearances of some value in an array.
     * We'll say that the "span" is the number of elements between the two inclusive.
     * A single value has a span of 1. Returns the largest span found in the given array.
     * (Efficiency is not a priority.)
     * @param nums
     * @return
     */
    public static int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }

        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            int leftMost = i;
            int rightMost = i;

            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] == nums[i]) {
                    rightMost = j;
                    break;
                }
            }
            int maxSpanTmp = rightMost - leftMost + 1;
            if(maxSpanTmp > maxSpan) {
                maxSpan = maxSpanTmp;
            }
        }

        return maxSpan;
    }
}

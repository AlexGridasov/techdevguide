package com.gri.alex;

/**
 * User: Alex
 * Date: 5-Jul-/18
 */
public class CanBalance {

    /**
     * Given a non-empty array, return true if there is a place to split the array
     * so that the sum of the numbers on one side is equal to the sum of the numbers
     * on the other side.
     * @param nums non-empty array
     * @return true if there is a place to split the array
     */
    public static boolean canBalance(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        } else {
            int halfSum = sum / 2;
            int check = 0;
            int i = 0;

            while(check < halfSum) {
                check += nums[i];
                if (check == halfSum) {
                    return true;
                }
                i++;
            }
        }

        return false;
    }
}

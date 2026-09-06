class Solution {
    public void moveZeroes(int[] nums) {

        int left = 0;

        for (int ryt = 0; ryt < nums.length; ryt++) {

            if (nums[ryt] != 0) {
                nums[left] = nums[ryt];
                left++;
            }
        }

        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}
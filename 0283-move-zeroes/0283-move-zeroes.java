class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
            for(int ryt=0;ryt<nums.length;ryt++){
                if(nums[ryt]!=0){
                    int temp=nums[left];
                    nums[left]=nums[ryt];
                    nums[ryt]=temp;
                    left++;
                }
            }
    }
}
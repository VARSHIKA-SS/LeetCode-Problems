class Solution {
    public int[] applyOperations(int[] nums) {
        int left=0;int ryt=1;
            while(ryt<nums.length){
            if(nums[left]==nums[ryt]){
                nums[left]=nums[left]*2;
                nums[ryt]=0;}
                ryt++;left++;
            }
            left=0;ryt=0;
            while(ryt<nums.length){
                if(nums[ryt]!=0){
                    int temp=nums[left];
                    nums[left]=nums[ryt];
                    nums[ryt]=temp;
                    left++;
                }ryt++;
        }return nums;
    }
}
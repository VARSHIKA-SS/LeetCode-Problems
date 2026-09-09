class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;int product=1;int count=0;
        if(k<1) return 0;
        for(int ryt=0;ryt<nums.length;ryt++){
           product=(product*nums[ryt]);
            while(product>=k && left!=nums.length){
                product/=nums[left++];
            } count+=(ryt-left+1);
        }return count;
    }
}
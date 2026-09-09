class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;int sum=0;int min=Integer.MAX_VALUE;boolean found=false;
        for(int ryt=0;ryt<nums.length;ryt++){
            sum+=nums[ryt];
            while(sum>=target){
                int temp_len=ryt-left+1;
                min=Math.min(temp_len,min);
                found=true;
                sum-=nums[left];
                left++;
            }
        }return found ? min:0;
    }
}
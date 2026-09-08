class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;double avg=0;double max=Integer.MIN_VALUE;
        for(int ryt=0;ryt<nums.length;ryt++){
            avg+=nums[ryt];
            if(ryt-left+1>k){
                avg=avg-nums[left++];
            }
            if(ryt-left+1 ==k){
                if(avg/k>max) {max=avg/k;}
            }
        }return max;
    }
}
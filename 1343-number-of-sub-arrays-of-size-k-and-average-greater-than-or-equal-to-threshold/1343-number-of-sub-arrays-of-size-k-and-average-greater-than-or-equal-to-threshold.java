class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;int avg=0;int sum=0;
        for(int ryt=0;ryt<arr.length;ryt++){
            avg+=arr[ryt];
            if(ryt-left+1 > k){
                avg-=arr[left++];
            }
            if(ryt-left+1 == k){
                if((avg/k)>=threshold){sum++;}
            }
        }return sum;
    }
}
class Solution {
    public int[] twoSum(int[] arr, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //     if(nums[i]+nums[j]==target)
        //     return new int[]{i,j};
        //     }
        // }return new int[]{};
        HashMap<Integer, Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int b=target-arr[i];
            if(hs.containsKey(b)){
                return new int[]{i,hs.get(b)};
            }
            else{
                hs.put(arr[i],i);
            }
        }return new int[]{};
    }
}
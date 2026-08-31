class Solution {
    public int singleNumber(int[] nums) {
        // int check=0;
        // for(int i=0;i<nums.length;i++){
        //     boolean flag=false;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j && nums[i]==nums[j]){ flag=true; break;}
        //     }if(!flag) return nums[i];
        // }return -1;
         HashMap<Integer,Integer> hs=new HashMap<>();
     for(int p: nums){if(hs.containsKey(p)) hs.put(p,(hs.get(p))+1);
     else hs.put(p,1);} 
     for(int l:hs.keySet()){
        if(hs.get(l)==1) return l;
     }return -1;  
    }
}
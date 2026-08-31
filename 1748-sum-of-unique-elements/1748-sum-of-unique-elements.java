class Solution {
    public int sumOfUnique(int[] nums) {
     HashMap<Integer,Integer> hs=new HashMap<>();
     for(int p: nums){if(hs.containsKey(p)) hs.put(p,(hs.get(p))+1);
     else hs.put(p,1);} 
     int sum=0;
     for(int l:hs.keySet()){
        if(hs.get(l)==1) sum+=l;
     }return sum;  
    }
}
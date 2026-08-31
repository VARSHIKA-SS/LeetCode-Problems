class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int count=0;
        for(int i:nums){
            if(hs.containsKey(i)) {
                count = count + hs.get(i);
                hs.put(i,hs.get(i)+1);
                
                }
            else {
                hs.put(i,1);
            }
        }   

        return count;
        
    }
}
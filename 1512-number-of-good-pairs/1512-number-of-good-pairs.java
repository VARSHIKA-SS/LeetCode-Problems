class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int count=0;
        for(int i:nums){
            if(hs.containsKey(i)) {hs.put(i,hs.get(i)+1);}
            else {hs.put(i,1);}
        }   
        int res=0;                                    
        for(int n:hs.keySet()){
            count=(hs.get(n));
            for(int i=0;i<count;i++)res+=i;
        }return res;
    }
}
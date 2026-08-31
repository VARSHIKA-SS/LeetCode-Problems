class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int n:nums){
            if(hs.containsKey(n)) hs.put(n,hs.get(n)+1);
            else hs.put(n,1);
        }
        int max=0,answer=0;
        for(int n:hs.keySet()){
            if(hs.get(n)>max) {max=hs.get(n);answer=n;}
        }
        return answer;
    }
}
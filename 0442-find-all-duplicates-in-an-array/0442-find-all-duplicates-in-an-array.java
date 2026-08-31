class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    HashMap<Integer,Integer> hs=new HashMap<>();
     for(int p: nums){if(hs.containsKey(p)) hs.put(p,(hs.get(p))+1);
     else hs.put(p,1);} 
     List<Integer> arr=new ArrayList<>();
     for(int l:hs.keySet()){
        if(hs.get(l)>1) {arr.add(l);};
     }return arr;  
    }
}
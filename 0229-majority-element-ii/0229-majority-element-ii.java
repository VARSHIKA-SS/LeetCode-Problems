class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int x:nums){
            if(hs.containsKey(x)){hs.put(x,hs.get(x)+1);}
            else{hs.put(x,1);}
        }
        for(int v:hs.keySet()) {
            if(hs.get(v)>(nums.length/3)) arr.add(v);
            }
        return arr;
    }
}
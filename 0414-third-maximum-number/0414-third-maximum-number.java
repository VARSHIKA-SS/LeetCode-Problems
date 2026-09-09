class Solution {
    public int thirdMax(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();int max=0;int c=0;
        for(int x:nums){
            if(hs.containsKey(x)) {hs.put(x,(hs.get(x))+1);}
            else {hs.put(x,1);}
        }
       ArrayList<Integer> arr=new ArrayList<>(hs.keySet());
       Collections.sort(arr,Collections.reverseOrder());
        if(arr.size()>=3) return arr.get(2);
        else return  arr.get(0);
    }
}
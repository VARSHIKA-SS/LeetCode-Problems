class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                if(Math.abs(hs.get(arr[i])-i)<=k) { flag=true;}
                else {hs.put(arr[i],i);}
            }
            else{
                hs.put(arr[i],i);
            }
        }if(flag) return true;
        else return false;
    }
}
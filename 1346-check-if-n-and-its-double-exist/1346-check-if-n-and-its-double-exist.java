class Solution {
    public boolean checkIfExist(int[] arr) {
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if((i!=j) && arr[i]==2*arr[j])
        //         return true;
        //     }
        // }return false;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:arr){            
            if(i%2==0 && hs.containsKey(i/2)) return true;
            if(hs.containsKey(i*2)) return true;
            else {hs.put(i,i*2);}
        }
        return false;
    }
}
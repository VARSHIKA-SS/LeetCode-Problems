class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hs=new HashMap<>();
        int count=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(hs.containsKey(ch)){hs.put(ch,(hs.get(ch))+1);}
            else{hs.put(ch,1);}}
            for(int i=0;i<jewels.length();i++){
                char v=jewels.charAt(i);
                if(hs.containsKey(v)) 
                count+=(hs.get(v));
                }return count;
    }
}
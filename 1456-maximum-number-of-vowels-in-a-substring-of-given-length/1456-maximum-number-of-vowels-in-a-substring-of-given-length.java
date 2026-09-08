class Solution {
    public int maxVowels(String s, int k) {
        int left=0;int max=0;int c=0;
        for(int ryt=0;ryt<s.length();ryt++){
            if("aeiouAEIOU".indexOf(s.charAt(ryt))!=-1) c++;
            if(ryt-left+1 >k){
                if("aeiouAEIOU".indexOf(s.charAt(left))!=-1) {c--;}
                left++;
            }
            if(ryt-left+1==k){
                if(max<c)max=c;
            }
        }return max;
    }
}
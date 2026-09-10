class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;int max=0;int len=0;
        HashSet<Character> hs=new HashSet<>();
        for(int ryt=0;ryt<s.length();ryt++){
            while(hs.contains(s.charAt(ryt))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(ryt));
            len=(ryt-left)+1;
            max=Math.max(len,max);
        }return max;
    }
}
class Solution {
    public String reverseWords(String s) {
        String word[]=s.trim().split("\\s+");
        int left=0;int ryt=word.length-1;
        while(left<ryt){
            String temp=word[left];
            word[left]=word[ryt];
            word[ryt]=temp;
            left++;ryt--;
        }
        return String.join(" ",word);
    }
}
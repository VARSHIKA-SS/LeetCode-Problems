class Solution {
    public boolean isPalindrome(String s) {
        int left=0;int ryt=s.length()-1;
        while(left<ryt){
            if(!Character.isLetterOrDigit(s.charAt(left)))left++;
            else if(!Character.isLetterOrDigit(s.charAt(ryt))) ryt--;
            else{
                if(Character.toLowerCase(s.charAt(left))!=(Character.toLowerCase(s.charAt(ryt)))) return false;
                left++;ryt--;
            }
        }return true;
    }
}
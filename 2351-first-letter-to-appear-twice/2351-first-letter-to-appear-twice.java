class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hs.contains(ch)) return ch;
            else hs.add(ch);
            }return '\0';
    }
}
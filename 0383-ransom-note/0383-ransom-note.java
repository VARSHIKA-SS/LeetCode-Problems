class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hs=new HashMap<>();
        char[] ch=ransomNote.toCharArray();
        for(int i=0;i<magazine.length();i++){
            if(hs.containsKey(magazine.charAt(i))) hs.put(magazine.charAt(i),hs.get(magazine.charAt(i))+1);
            else hs.put(magazine.charAt(i),1);
        }
        for(char c:ch){
            if(hs.containsKey(c)){hs.put(c,(hs.get(c))-1);}
            if(!hs.containsKey(c))
    return false;
            if(hs.get(c)<0) return false;
        }return true;
    }
}
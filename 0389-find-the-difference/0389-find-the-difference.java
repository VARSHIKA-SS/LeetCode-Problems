class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hs1=new HashMap<>();
        for(int i=0;i<s.length();i++){if (hs1.containsKey(s.charAt(i))){hs1.put(s.charAt(i),hs1.get(s.charAt(i))+1);}
        else hs1.put(s.charAt(i),1);}
        HashMap<Character,Integer> hs2=new HashMap<>();
        for(int i=0;i<t.length();i++){if (hs2.containsKey(t.charAt(i))){hs2.put(t.charAt(i),hs2.get(t.charAt(i))+1);}
        else hs2.put(t.charAt(i),1);}
        for(char ch : hs2.keySet()) {
    if(!hs1.containsKey(ch)) {
        return ch;
    }
    if(hs2.get(ch) > hs1.get(ch)) {
        return ch;
    }
}return ' ';

    } 
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char t[]=strs[i].toCharArray();
            Arrays.sort(t);
            String s=new String(t);
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            }
            else{
                List<String> l=new ArrayList<>();
                l.add(strs[i]);
                map.put(s,l);
            }
        }return new ArrayList<>(map.values());
    }
}
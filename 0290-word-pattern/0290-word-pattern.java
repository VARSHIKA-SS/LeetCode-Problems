
class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> hs = new HashMap<>();
        String[] ps = s.split(" ");

        if (pattern.length() != ps.length) return false;

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);

            if (hs.containsKey(ch)) {
                if (!ps[i].equals(hs.get(ch))) {
                    return false;
                }
            }
            else {
                if (hs.containsValue(ps[i])) return false;

                hs.put(ch, ps[i]);
            }
        }

        return true;
    }
}

class Solution {
    public String reversePrefix(String s, char ch) {
        int left=0;
        char[] arr=s.toCharArray();
        for(int ryt=s.indexOf(ch);ryt>left;ryt--){
                char temp=arr[left];
                arr[left]=arr[ryt];
                arr[ryt]=temp;
                left++;
        }
    return new String(arr);
    }
}
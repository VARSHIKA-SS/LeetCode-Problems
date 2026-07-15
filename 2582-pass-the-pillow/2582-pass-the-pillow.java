class Solution {
    public int passThePillow(int n, int time) {
        int p=1,m=1;
        while(time-- >0)
        {
            if(p==n){
                m=-1;
            }
            if(p==1)
            m=1;
            p=p+m;
        }return p;
}}
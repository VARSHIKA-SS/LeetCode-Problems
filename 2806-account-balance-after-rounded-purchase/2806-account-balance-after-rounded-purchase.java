class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        //1) return 100 - (((purchaseAmount + 5) / 10) * 10);
        /*2) int num=purchaseAmount%10;
        if(purchaseAmount==10){
         return 90;}
        if(num>=5){
            for(int i=purchaseAmount;i<purchaseAmount*purchaseAmount;i++){ 
                if(i%10==0){ 
                return 100-i;
        }}}
        if(num<5){
            for(int i=purchaseAmount;;i--){ 
                if(i%10==0){ 
                return 100-i;
        }}
}return 1;}}*/
int ld=purchaseAmount%10;
if(ld>=5)
purchaseAmount+=10-ld;
else purchaseAmount-=ld;
return 100-purchaseAmount;
    }}
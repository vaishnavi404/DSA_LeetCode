class Solution {
    public boolean isPalindrome(int x) {
        long p=0;
        int y=x;
        if(x<0){return false;}
        while(x>0){
             p=(p*10)+(x%10);
             x=x/10;
             System.out.println(p+" "+x);
        }
        p=p+x;
        if(p==y){return true;}
        return false;
    }
}
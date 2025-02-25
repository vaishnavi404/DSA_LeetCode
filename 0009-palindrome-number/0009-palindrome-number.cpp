class Solution {
public:
    bool isPalindrome(int x) {
       long int num =0;
        if(x<0||x>INT_MAX)
            return false;
      
        int y=x;
        while(x>0){
            num = num*10;
            if(num>INT_MAX){
                return false; }
            num = num + (x%10);
            x = x/10;
        }
        if(y==num)
        return true;
        else
            return false;
    }
};
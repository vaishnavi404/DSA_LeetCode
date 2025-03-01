class Solution {

    public int helper(int num,int step){
        if(num==0){
        System.out.println(num);
        return step;
      }
        if(num%2==0){
           num=num/2;
            step++;
        }
        else{
            num=num-1;
             step++;
        }
        System.out.println(num+" "+step);
      return helper(num,step);
    }
    public int numberOfSteps(int num) {
      return helper(num,0);
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
    int maxsum=Integer.MIN_VALUE;
    int sum=0;
    if(nums.length==1){
        return nums[0];
    }  
     while(i<nums.length){
         
       
          if(sum<0 ){
            sum=0;
          } 
           sum=sum+nums[i];
           System.out.println(sum+" "+ maxsum);
          if(maxsum<sum){
             maxsum=sum;
            }
          System.out.println(sum+" "+ maxsum);
        i++;
        }
        return maxsum;
    }
}
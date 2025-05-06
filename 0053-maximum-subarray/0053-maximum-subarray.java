class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
    int maxsum=0;
    int sum=0;
    if(nums.length==1){
        return nums[0];
    }
        while(i<nums.length){
         
         System.out.println(sum);
          if(sum<0 && nums[i]>0){
            sum=0;
          }
           sum=sum+nums[i];
          if(maxsum<sum){
                maxsum=sum;
            }
          System.out.println(sum+" "+ maxsum);
        i++;
        }
        return maxsum;
    }
}
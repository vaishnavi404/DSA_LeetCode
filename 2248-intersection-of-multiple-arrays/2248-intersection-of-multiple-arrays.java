class Solution {
    public List<Integer> intersection(int[][] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }

        Set<Integer> common = Arrays.stream(nums[0])
                                   .boxed()
                                   .collect(Collectors.toSet());

        for(int i=1;i<nums.length;i++){
           
                      common.retainAll( Arrays.stream(nums[i])
                                   .boxed()
                                   .collect(Collectors.toSet()));   
             if (common.isEmpty()) {
                break;
            }  
               
        }  
         return common.stream()
                    .sorted()
                    .collect(Collectors.toList());                               
     }
}
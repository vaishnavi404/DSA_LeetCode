class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
      vector<int> answer;
      unordered_map<int,int> hashTable;
        for(int i=0;i<nums.size();i++){
            if(hashTable.find(target-nums[i])!=hashTable.end()){
            answer.push_back(hashTable[target-nums[i]]);
                answer.push_back(i);
                return answer;
            }
            hashTable[nums[i]]=i;
        }
        return answer;
    }
};
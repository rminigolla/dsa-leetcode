class Solution {
public:
    int f(int x,vector<int>& nums){
        int cnt = 0;
        for(int i = 0;i<x;i++){
            if(nums[i] == nums[x]){
                cnt++;
            }
        }
        return cnt;
    }
    int numIdenticalPairs(vector<int>& nums) {
        int n = nums.size();
        int ans=0;
        for(int i = 0;i<n;i++){
            int a = f(i,nums);
            ans += a;
        }
        return ans;
        
    }
};
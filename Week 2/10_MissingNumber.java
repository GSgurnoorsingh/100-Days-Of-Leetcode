class Solution {
    public int missingNumber(int[] nums) {
        int range=nums.length;
        int actualsum=(range*(range+1))/2; //n(n+1)/2
        int currSum=0;
        for(int i=0;i<range;i++){
            currSum+=nums[i];
        }
        int ans=actualsum-currSum;
        return ans;
    }
}

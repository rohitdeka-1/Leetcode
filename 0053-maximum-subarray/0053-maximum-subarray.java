class Solution {
    public int maxSubArray(int[] nums) {
        int j=0;
        int sum = 0;
        int maxSum = nums[j];
        while(j<nums.length){
            sum += nums[j];
            maxSum = Math.max(sum,maxSum);
            if(sum<0){
                sum = 0;
            }
            j++;
        }
        return maxSum;
    }
}
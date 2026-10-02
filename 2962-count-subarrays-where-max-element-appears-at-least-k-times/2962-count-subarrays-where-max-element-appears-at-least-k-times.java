class Solution {
    public long countSubarrays(int[] nums, int k) {

        int maxi = 0;
        for(int i=0;i<nums.length;i++){
            maxi = Math.max(maxi, nums[i]);
        }

        int i = 0;
        int j = 0;
        long ans = 0;
        int count = 0;
        while(j<nums.length){
            
            if(nums[j]==maxi){
                count++;
            }
            
            while(count>=k){
                ans += nums.length - j;
                if(nums[i]==maxi){
                    count--;
                }
                i++;
            }

            j++;

        }

        return ans;

    }
}
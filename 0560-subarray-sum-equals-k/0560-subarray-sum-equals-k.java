class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int preSum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            preSum = preSum + nums[i];
            if(map.containsKey(preSum - k)){
                count += map.get(preSum-k);
            }
            map.put(preSum,map.getOrDefault(preSum, 0)+1);
        
        }
        
        return count;
        
    }
}
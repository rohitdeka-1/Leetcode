class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;
        int j=0;

        HashMap<Integer,Integer> map = new HashMap<>();
        int longest = Integer.MIN_VALUE;
        int count = 0;
        while(j<nums.length){
            int num = nums[j];
            map.put(num,map.getOrDefault(num,0)+1);
            count++;
            while(map.get(num)>k){
                int leftNum = nums[i];
                map.put(leftNum,map.getOrDefault(leftNum,0)-1);
                i++;
                count--;
            };
            longest = Math.max(longest, count);
            j++;
        }

        return longest;
        
    }
}
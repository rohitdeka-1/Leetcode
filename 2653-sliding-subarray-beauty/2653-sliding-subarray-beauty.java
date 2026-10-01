class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        
        int i=0;
        int j=0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[nums.length - k + 1 ];
        int t = 0;
        while(j<nums.length){  
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            if(j-i+1==k){
                int negatives = 0;
                for(int m=-50;m<0;m++){
                    if(map.containsKey(m)){
                        negatives += map.get(m);
                        if(negatives>=x){
                            arr[t] = m;
                            break;
                        }
                    }
                }
                t++;
                
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            j++;


        }
        
        return arr;

    }
}
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
     

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             int num = arr[i];
            if(map.get(arr[i])==num){
                largest = Math.max(largest,arr[i]);
            }
            
        }

        if(largest>Integer.MIN_VALUE){
            return largest;
        };

        return -1;


    }
}
//complement

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums1.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int sum = nums1[i] + nums2[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }

        int counter = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int sum = nums3[i] + nums4[j];
                if(map.containsKey(-sum)){
                    counter += map.get(-sum);
                } else{
                    counter += 0;
                }
            }
        }

        return counter;


        // //nums1 = [1,2], nums2 = [-2,-1]
        // //nums3 = [-1,2], nums4 = [0,2]

        // [
        //     1 , 2
        //     -2, -1 
        // ]

        // [
        //     -1, 2
        //     0, 2
        // ]


        // map = 
        // [
        //     -1,1,
        //     0,2,
        //     1,1,
        // ]

        // nums3 = [-1,2], nums4 = [0,2]

        // sum = [ -1,1,2,4 ]

        // counter = 0;
        // map.get(-sum);
        // map.get(1) //1

        // counter = 0+1 = 1

        // map.get(-sum)
        // map.get(-1) //1
        // counter  2 

        // map.get(-sum)
        // map.getOrDefault(-2) // 0
        // counter = 2 + 0 = 2

        // map.get(-sum)
        // map.getOrDeault(-4) //0
        // counter = 2


    }
}
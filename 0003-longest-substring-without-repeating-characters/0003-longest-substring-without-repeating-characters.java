class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i=0;
        int j=0;
        int ans=0;
 

        while(j<s.length()){

            int count=0;
            HashSet<Character> map = new HashSet<>();

            while(j<s.length() && !map.contains(s.charAt(j)) ){
                map.add(s.charAt(j));
                count++;
                ans = Math.max(ans,count);
                j++;    
            }
            j=i;
            i++;
        }

        return ans;

    }
}
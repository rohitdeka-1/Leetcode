class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int start=0;
        int end=0;

        while(end<s2.length()){
            char ch = s2.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)-1);

            if(end-start+1==s1.length()){
                boolean permutation = true;
                for(int num : map.values()){
                    if(num!=0){
                        permutation = false;
                        break;
                    }
                }
                if(permutation){
                    return true;
             
                }
                char leftChar = s2.charAt(start);
                map.put(leftChar, map.getOrDefault(leftChar, 0)+1);
                start++;
            }
            end++;
        }

        return false;

    }
}
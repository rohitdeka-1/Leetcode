class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i=0;
        int j=0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int d=0;d<p.length();d++){
            map.put(p.charAt(d),map.getOrDefault(p.charAt(d),0)+1);
        };

        ArrayList<Integer> arr = new ArrayList<>();

        while(j<s.length()){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch, 0)-1);

            if(j-i+1==p.length()){
                boolean valid = true;
                for(int num: map.values()){
                    if(num!=0){
                        valid = false;
                        break;
                    }
                }

                if(valid){
                    arr.add(i);
                }

                char leftChar = s.charAt(i);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                map.put(leftChar, map.getOrDefault(leftChar, 0)+1);
                i++;
            }
            j++;
        }

        return arr; 
    }
}
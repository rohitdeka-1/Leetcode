class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int k=p.length();

        for(int l=0;l<p.length();l++){
            char ch = p.charAt(l);
            map.put(ch, map.getOrDefault(ch,0)+1);
        };

        while(j<s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)-1);

            if(j-i+1==k){
                boolean valid = true;
                for(int num : map.values()){
                    if(num!=0){
                        valid = false;
                        break;
                    }
                }
                if(valid){
                    arr.add(i);
                }

                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
                i++;
            }
            j++;
        }

        return arr;

    }
}
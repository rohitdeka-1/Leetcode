class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int j = 0;

        int required = t.length();
        int count = 0;

        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    count++;
                }
                map.put(ch, map.getOrDefault(ch, 0) - 1);
            }

            while (count == required) {
                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    startIndex = i;
                }

                char leftChar = s.charAt(i);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.getOrDefault(leftChar, 0) + 1);
                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }
                i++;
            }
            j++;

        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(startIndex, startIndex + minLen);

    }
}
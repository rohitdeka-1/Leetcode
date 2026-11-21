class Solution {
    HashMap<Character,String> map = new HashMap<>();
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve(0, digits, new StringBuilder());
        return ans;
        
    }

    public void solve(int idx, String digits, StringBuilder path){
        if(idx == digits.length()){
            ans.add(path.toString());
            return;
        }

        String letters = map.get(digits.charAt(idx));

        for(int i=0;i<letters.length();i++){
            path.append(letters.charAt(i));

            solve(idx+1,digits, path);

            path.deleteCharAt(path.length()-1);

        }

    }

}
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        if(strs[0].length() == 0)
            return "";
        int idx = 0;
        while(true){
            if(idx >= strs[0].length())
                return strs[0].substring(0,idx);
            char cur = strs[0].charAt(idx);
            boolean ans = true;
            for(int i = 1 ; i < strs.length ; i ++){
                if(idx >= strs[i].length()){
                    return strs[0].substring(0,idx);
                }
                ans = ans && (cur == strs[i].charAt(idx));
            }
            if(ans == false){
                return strs[0].substring(0,idx);
            }else{
                idx ++;
            }
        }
    }
}
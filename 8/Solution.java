public class Solution {
    public long Atoi(String s){
        char str[] = s.toCharArray();
        long cur = 0;
        for(int i = 0; i < str.length ; i ++){
            if(cur > Integer.MAX_VALUE || cur < Integer.MIN_VALUE)
                return cur;
            if(str[i] >= '0' && str[i] <= '9'){
                cur *= 10;
                cur += str[i] - '0';
            }else
                return cur;
        }
        return cur;
    }
    public int myAtoi(String str) {
        str = str.trim();
        if(str.length() == 0)
            return 0;
        long ans = -1;
        if(str.charAt(0) == '+'){
            ans = Atoi(str.substring(1,str.length()));
        }else if(str.charAt(0) == '-'){
            ans = -Atoi(str.substring(1,str.length()));
        }else
            ans = Atoi(str);
        if(ans > Integer.MAX_VALUE)
            ans = Integer.MAX_VALUE;
        if(ans < Integer.MIN_VALUE)
            ans = Integer.MIN_VALUE;
        return (int)ans;
    }
}
public class Solution {
    public String reverse (String x){
        StringBuilder sb = new StringBuilder(x);
        return sb.reverse().toString();
    }
    public int reverse(int x) {
        int a = Math.abs(x);
        if(a == Integer.MIN_VALUE || a == Integer.MAX_VALUE)
            return 0;
        long ans = Long.valueOf(reverse(a+""));
        if(x < 0){
            ans *= -1;
            if(ans < Integer.MIN_VALUE)
                return 0;
            else
                return (int)ans;
        }else{
            if(ans > Integer.MAX_VALUE)
                return 0;
            else
                return (int)ans;
        }
    }
}
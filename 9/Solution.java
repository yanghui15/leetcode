public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int str[] = new int[10];
        int cur = 0;
        while(true){
            str[cur ++] = x%10;
            x /= 10;
            if(x == 0)
                break;
        }
        int is[] = new int[cur];
        for(int i = 0 ; i < cur ; i ++){
            is[cur - 1 - i] = str[i];
        }
        for(int i = 0 ; i < cur ; i ++){
            if(str[i] != is[i])
                return false;
        }
        return true;
    }
}
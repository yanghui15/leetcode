import java.util.*;
public class Solution {
    public String longestPalindrome(String s) {
        char a[] = s.toCharArray();
        char str[] = new char[a.length * 2];
        int cur = 0;
        for(int i = 0 ; i < a.length ; i ++){
            str[cur ++] = a[i];
            str[cur ++] = ' ';
        }
        int len = str.length;
        int idx = -1;
        int mx = -1;
        for(int i = 0 ; i < len ; i ++){
            int ll = 0;
            for(int j = 1 ; j < len; j++){
                if(i + j >= len || i - j < 0)
                    break;
                if(str[i+j] == str[i-j])
                    ll ++;
                else
                    break;
            }
            if(ll > mx){
                idx = i;
                mx = ll;
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i = idx - mx  ; i <= idx + mx ; i ++){
            if(str[i] != ' ')
                sb.append(str[i]);
        }
        return sb.toString();
        
    }
}

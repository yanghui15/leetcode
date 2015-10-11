public class Solution {
    public String intToRoman(int num) {
        String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};    
        int value[]=    {1000,900,500,400, 100, 90,  50, 40,  10, 9,   5,  4,   1}; 
        int idx = 0;
        String ans = "";
        while(true){
            if(num == 0)
                break;
            while(num >= value[idx]){
                ans += symbol[idx];
                num -= value[idx];
            }
            idx ++;
        }
        return ans;
    }
}
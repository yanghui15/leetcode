public class Solution {
    public int romanToInt(String s) {
        if(s.length() == 0)
            return 0;
        String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};    
        int value[]=    {1000,900,500,400, 100, 90,  50, 40,  10, 9,   5,  4,   1}; 
        for(int i = 0 ; i < value.length ; i ++){
            if(s.startsWith(symbol[i])){
                if(symbol[i].length() == 1)
                    return value[i] + romanToInt(s.substring(1));
                else
                    return value[i] + romanToInt(s.substring(2));
            }
        }
        return 0;
    }
}
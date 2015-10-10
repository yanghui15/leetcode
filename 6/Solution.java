public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        ArrayList<Character> list[] = new ArrayList[numRows];
        for(int i = 0 ; i < numRows ; i ++)
            list[i] = new ArrayList<Character>();
        char str[] = s.toCharArray();
        int cur = 0;
        int flag = 1;
        int idx = 0;
        while(true){
            if(cur == str.length)
                break;
            list[idx].add(str[cur ++]);
            if(idx == numRows - 1){
                flag = -1;
            }else if(idx == 0)
                flag = 1;
            idx += flag;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < numRows ; i ++){
            for(Character c : list[i])
                sb.append(c);
        }
        return sb.toString();
    }
}
public class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2)
            return 0;
        int mx = -1;
        int left = 0 , right = height.length - 1;
        while(left < right){
            mx = Math.max(mx , (right - left) * Math.min(height[left] , height[right]));
            if(height[left] < height[right]){
                left ++;
            }else
                right --;
        }
        return mx;
    }
}
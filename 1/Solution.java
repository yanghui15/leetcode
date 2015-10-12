import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0 ; i <= nums.length ; i ++){
            if(set.contains(target - nums[i])){
                for(int j = 0 ; j < i ; j ++){
                    if(nums[i] + nums[j] == target){
                        return new int[]{j+1 , i + 1};
                    }
                }
            }else{
                set.add(nums[i]);
            }
        }
        return null;
    }
}
import java.util.*;
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if(s==null)
            return 0;
	    char[] arr = s.toCharArray();
	    int pre = 0;
	    HashSet<Character> set = new HashSet<Character>();
	    for(int i = 0 ; i < arr.length ; i ++){
		    set.add(arr[i]);
	    } 
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    for (int i = 0; i < arr.length; i++) {
		    if (!map.containsKey(arr[i])) {
			    map.put(arr[i], i);
		    } else {
			    pre = Math.max(pre, map.size());
			    if(pre == set.size())
				    break;
			    i = map.get(arr[i]);
			    map.clear();
		    }
	    }

	    return Math.max(pre, map.size());
    }


}
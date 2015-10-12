public class Solution {
    public int findKthfromSortedArrays(int left1 , int right1 , int[] nums1 
		, int left2 , int right2 , int[] nums2 , int k){
		//System.out.println(left1 +" "+ right1 +" "+left2 +" "+right2 +" "+k);
		int m = right1 - left1 + 1;
		int n = right2 - left2 + 1;
		if(m > n){
			return findKthfromSortedArrays(left2 , right2 , nums2 , left1 , right1 , nums1 , k);
		}
		if(m == 0){
			return nums2[left2 + k - 1];
		}
		if(k == 1){
			return Math.min(nums1[left1] , nums2[left2]);
		}

		int ps1 = Math.min(k/2 , m);
		int ps2 = k - ps1;
		if(nums1[left1 + ps1 - 1] < nums2[left2 + ps2 - 1]){
			return findKthfromSortedArrays(left1 + ps1 , right1 , nums1 , 
				left2 , right2 , nums2 , k - ps1);
		}else if(nums1[left1 + ps1 - 1] > nums2[left2 + ps2 - 1]){
			return findKthfromSortedArrays(left1 , right1 , nums1 ,
				left2 + ps2 , right2 , nums2 , k - ps2);
		}else{
			return nums1[left1 + ps1 - 1];
		}
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if((n + m) % 2 == 1){
        	return findKthfromSortedArrays(0 , n - 1 , nums1 , 
        		0 , m - 1 , nums2 , (n+m)/2 + 1);
        }else{
        	return ((double)findKthfromSortedArrays(0 , n - 1 , nums1 , 0 , m - 1 , nums2 , (n+m)/2) +
        		(double)findKthfromSortedArrays(0 , n - 1 , nums1 , 0 , m - 1 , nums2 , (n + m)/2 + 1))/2;
        }

    }
}
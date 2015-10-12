import java.util.*;
public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode cur = null;
		ListNode result = new ListNode(0);
		cur = result;
		int carry = 0;
		while(true){
			if(l1 == null && l2 == null)
				break;
			int num1 = 0;
			if(l1 != null){
				num1 = l1.val;
				l1 = l1.next;
			}

			int num2 = 0;
			if(l2 != null){
				num2 = l2.val;
				l2 = l2.next;
			}
			int ans = carry + num1 + num2;
			cur.next = new ListNode(ans % 10);
			cur = cur.next;
			carry = ans / 10;
		}
		if(carry == 1){
			cur.next = new ListNode(1);
		}
		
		return result.next;
	}

}
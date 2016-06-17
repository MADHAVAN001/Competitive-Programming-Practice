/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
		return head;
	ListNode result = head.next;
	ListNode p1 = head;
	ListNode p2 = head.next;
	while(p1 != null && p2 != null)
	{
	ListNode t = p2.next;
	if(t != null && t.next != null)
		p1.next = t.next;
	else
		p1.next = t;
	p2.next = p1;
	p1 = t;
	if(p1 != null)
		p2 = p1.next;
	else
		p2 = null;
	}
	return result;
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
		return false;
	ListNode p1 = head.next;
	ListNode p2 = head.next.next;
	while(p1 != null && p2!=null)
	{
	p1 = p1.next;
	if(p2.next != null)
		p2 = p2.next.next;
	else
		return false;
    if(p1 == p2 && p1!=null)
        return true;
	}
	if(p1 == null || p2 == null)
		return false;
	return true;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
		return null;
	if(l1 == null)
		return l2;
	if(l2 == null)
		return l1;
	ListNode start;
	if(l1.val<l2.val)
		{
		start = l1;
		l1 = l1.next;
		}
	else
		{
		start = l2;
		l2 = l2.next;
		}
	ListNode result = start;
	while(l1 != null && l2 != null)
	{
	if(l1.val<l2.val)
		{
		start.next = l1;
		l1 = l1.next;
		start = start.next;
		}
	else
		{
		start.next = l2;
		l2 = l2.next;
		start = start.next;
		}	
	}
	while(l1!=null)
	{
		start.next = l1;
		l1 = l1.next;
		start = start.next;	
	}
	while(l2!=null)
	{
		start.next = l2;
		l2 = l2.next;
		start = start.next;	
	}
	return result;	
    }
}

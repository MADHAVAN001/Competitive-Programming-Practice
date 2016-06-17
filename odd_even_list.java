/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
 	ListNode result = head;
	ListNode p1 = head;
	ListNode p2 = head.next;
	ListNode tmpNode = head.next;
	while(p1 != null && p2!= null)
	{
	if(p2.next == null)
		break;
	p1.next = p2.next;
	p2.next = p1.next.next;
	p1 = p1.next;
	p2 = p2.next;
	}
	p1.next = tmpNode;
	return result;       
    }
}

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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
		return null;
	int countA = getLength(headA);
	int countB = getLength(headB);
	int diff = countA>countB?countA-countB: countB-countA;
	int count = countA<countB?countA:countB;
	if(countA>countB)
	headA = movePointer(headA,diff);
	else
	headB = movePointer(headB,diff);
	while(count>0 && headA != null && headB != null)
	{
	count--;
	if(headA.val == headB.val && headA.next == headB.next)
		return headA;
	headA = headA.next;
	headB = headB.next;
	}
	return null;
    }

public int getLength(ListNode listNode)
	{
	int count = 0;
	ListNode node = listNode;
	while(node!=null)
	{
	count++;
	node = node.next;
	}
	return count;
	}
public ListNode movePointer(ListNode head, int count)		
	{
	if(count == 0)
		return head;
	while(count>0 && head != null)
	{
	count--;
	head = head.next;
	}
	return head;
	}
}

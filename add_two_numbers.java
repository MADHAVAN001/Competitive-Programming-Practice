/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	if(l1 == null && l2 == null)
		return null;        
	if(l1 == null)
		return l2;
	if(l2 == null)
		return l1;
	ListNode result = new ListNode(0);
	ListNode head_node = new ListNode(0);
	result.next = head_node;
	int carry = 0;
	while(l1 != null && l2 != null)
	{
		int val = 0;
		val = l1.val + l2.val+carry;
		ListNode head;
		if(val>=10)
		{
		head = new ListNode(val - 10);
		carry = 1;
		} 
		else
		{
		head = new ListNode(val);
		carry = 0; 
		}
		head.next = null;
		l1 = l1.next;
		l2 = l2.next;
	head_node.next = head;
		head_node = head_node.next;
	}
	while(l1!=null)
	{
		int val = l1.val + carry; 
ListNode head;
		if(val >= 10)
		{
			head = new ListNode(val-10);
			carry = 1;
		}
		else
		{
			head = new ListNode(val);
			carry = 0;
		}
		head.next = null;
		l1 = l1.next;

	head_node.next = head;
		head_node = head_node.next;
	}
	while(l2!=null)
	{
		int val = l2.val + carry; 
ListNode head;
		if(val >= 10)
		{
			head = new ListNode(val-10);
			carry = 1;
		}
		else
		{
			head = new ListNode(val);
			carry = 0;
		}
		head.next = null;
		l2 = l2.next;

	head_node.next = head;
		head_node = head_node.next;
	}
	if(carry == 1)
		{
		ListNode node = new ListNode(carry);
		node.next = null;
		head_node.next = node;
		}
	return result.next.next;
    }
}

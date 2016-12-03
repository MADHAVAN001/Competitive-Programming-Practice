/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

ListNode head;
ListNode h;    
public TreeNode sortedListToBST(ListNode head) {
	if(head == null)
		return head;        
	this.head = head;
	h = head;
	ListNode p1 = head;
	int length = 0;
	while(p1!=null)
	{
	length++;
	p1 = p1.next;
	}
	return convert(1,length);
    }

public TreeNode convert(int start, int ending)
{
if(start>ending)
	return null;
int mid = (start+ending)/2;
TreeNode left = convert(start, mid-1);
TreeNode node = new TreeNode(h.val);
h = h.next;
node.left = convert(start, mid-1);
node.right = convert(mid+1,ending);
return node;	
}

public ListNode position(int pos)
{
ListNode p1 = head;
while(p1!=null)
{
pos--;
if(pos == 0)
	return p1;
p1 = p1.next;
}
return null;
}
}

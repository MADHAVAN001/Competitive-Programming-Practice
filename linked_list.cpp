using namespace std;
#include<iostream>
class Node{
Node next = null;
int data = 0;
public Node(int d)
	{
	data = d;
	}
	void addtotail(int d)
	{
		Node end = new Node(d);
		Node n = this;
		while(n.next != null)
			{
			n = n.next;
			}
		n.next = end;
	}
	Node deletenode(Node head,int d)
	{
		Node n = head;
		if(n.data == d)
			return head = head.next;
		while(n!= null)
		{
			if(n.next.data == d)
				{
				n.next = n.next.next;
				return head;
				}
			n = n.next;
		}
	}
	void removeduplicates(Node head)
	{
		int A[100];
		int j = 0;
		Node n = head;
		while(n != null)
		{
			n.data = A[j];
			n = n.next;
			for(int i = 0;i<j;i++)
			{
			if(A[i] = n.next.data)
				Node t = n.next;
			} 
		}
	}
}

int main()
{
int a[100];
return 0;
}

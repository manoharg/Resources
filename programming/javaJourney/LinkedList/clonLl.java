class Node
{
	int data;
	Node next;
	Node(int data, Node next)
	{
		this.data=data;
		this.next= next;
	}
}
public class clonLl
{
public static void printList(Node head)
{
	Node current= head;
	while(current!=null)
	{
		System.out.print(current.data+" ");
		current= current.next;
	}
	System.out.println("");

}

public static Node cloneIt(Node head)
{
	Node current=head;
	Node h=null;
	Node tail= null;
	while(current!=null)
	{
		if(h==null)
		{
			h= new Node(head.data,null);
			tail=h;
		}else
		{
		//	System.out.print(current.data+"tt ");
			tail.next= new Node(current.data, null);
			tail=tail.next;

		}
		current = current.next;
	}
	return head;
}
 public static void main(String[] args) {


Node head=null;
int[] keys= new int[]{1,2,3,4};

for(int i=0;i<keys.length;i++)
{
	head= new Node(keys[i], head);
}

printList(head);
printList(cloneIt(head));
}


}
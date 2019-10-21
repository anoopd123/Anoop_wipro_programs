package DSprograms;

public class DoubleLinkedList {
	Node head;
	public void insert(int data)
	{
		Node n=new Node();
		n.data=data;
		n.next=null;
		n.prev=null;
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node node=new Node();
			node=head;
			while(node.next!=null)
			{
				node=node.next;
			}
			node.next=n;
			n.prev=node;
		}
	}
	public void display()
	{
		Node s=head;
		while(s.next!=null)
		{
			System.out.println(s.data);
			s=s.next;	
		}
		System.out.println(s.data);
		System.out.println(s.prev.data);
	}

}

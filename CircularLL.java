package DSprograms;

public class CircularLL {
	Node head;
	Node qq;
	public void insert(int data)
	{
		Node n=new Node();
		qq=head;
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
			//n.next=head;
			
		}
	}
	public void display()
	{
		Node s=head;
		Node q=head;
		while(s.next!=null)
		{
			System.out.println(s.data);
			s=s.next;	
		}
		s.next=head;
		q.prev=s;
		System.out.println(s.data);
		System.out.println(q.prev.data);
	}

}

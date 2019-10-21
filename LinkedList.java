package DSprograms;


public class LinkedList {
	Node head;
	public void insert(int data)
	{
		Node n=new Node();
		n.data=data;
		n.next=null;
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
		}
	}
	public void display()
	{
		
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		
		System.out.println(node.data);
		
	}
	

}

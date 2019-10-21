package DSprograms;

public class QueueDS {
	int queue[]=new int[5];
	int front=0;int rear=0;int size=0;
	public void enqueue(int data)
	{
		if(rear==5)
		{
			System.out.println("queue is full");
		}
		else
		{
			queue[rear]=data;
			rear++;
			size++;
		}
	}
	public void dequeue()
	{
		if(rear==0||front>=rear)
		{
			System.out.println("\nqueue is empty");
		}
		else
		{
			
			queue[front]=0;
			front++;
			size--;
			System.out.println("\nafter dequeue");
			display();
		}
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[front+i]+" ");
		}
	}
	public int peek()
	{
		return queue[front-1];
	}

}

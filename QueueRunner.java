package DSprograms;

public class QueueRunner {
	public static void main(String args[])
	{
		QueueDS queue=new QueueDS();
		queue.enqueue(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		System.out.println();
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	}

}

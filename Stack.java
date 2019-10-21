package DSprograms;

public class Stack {
	int top=0;
	int capacity=2;
	int stack[]=new int[capacity];
	public void push(int data)
	{
		if(size()==capacity)
		{
			expand();
		}
		stack[top]=data;
		top++;
	}
	private void expand() {
		int newstack[]=new int[capacity*2];
		System.arraycopy(stack, 0, newstack, 0, size());
		stack=newstack;
		capacity*=2;
	}
	public int pop(int data)
	{
		if(top==0)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			top--;
			stack[top]=0;
			
		}
		return data;
	}
	public void display()
	{
		for(int n:stack) System.out.print(n+" ");
	}
	public int size() {
		return top;
	}
	public int peek()
	{
		return stack[top-1];
	}

}

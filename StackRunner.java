package DSprograms;

public class StackRunner {
	public static void main(String args[])
	{
		Stack num=new Stack();
		num.push(5);
		num.push(3);
		System.out.println();
		num.display();
		num.push(4);
		System.out.println();
		num.display();
		num.push(1);
		num.push(6);
		System.out.println();
		num.display();
		System.out.println("\npeek val is");
		System.out.print(num.peek());
	}

}

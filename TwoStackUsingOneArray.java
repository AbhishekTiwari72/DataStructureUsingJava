package com.StackTest;

public class TwoStackUsingOneArray {

	int size,top1,top2;
	int arr[];
	public TwoStackUsingOneArray(int n) {
		// TODO Auto-generated constructor stub
		arr=new int[n];
		size=n;
		top1=-1;
		top2=size;
	}
	
	//Push in one stack.	
	void push1(int x)
	{
		if(top1<top2-1)
		{
			top1++;
			arr[top1]=x;
		}
		else
		{
			System.out.println("Stack Overflow.");
			System.exit(1);
		}
	}
	//Push in second stack.
	void push2(int x)
	{
		if(top1<top2-1)
		{
			top2--;
			arr[top2]=x;
		}
		else
		{
			System.out.println("Stack Overflow.");
			System.exit(1);
		}
	}
	
	int pop1()
	{
		if(top1>=0)
		{
			int x=arr[top1];
			top1--;
			return x;
		}
		else
		{
			System.out.println("Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2()
	{
		if(top1>=0)
		{
			int x=arr[top2];
			top2--;
			return x;
		}
		else
		{
			System.out.println("Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		TwoStackUsingOneArray ts = new TwoStackUsingOneArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                           " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                         " stack2 is " + ts.pop2());

	}

}

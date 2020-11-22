package com.StackTest;

class Stack
{
	private int capcity;
	private int a[];
	private int top;
	
	
	
	boolean isEmpty()
	{
		return (top<0);
	}
	
	public Stack(int Size)
	{
		a=new int[Size];
		capcity=Size;
		top=-1;
	}
	
	public void push(int x) {
	    if (isFull()) {
	      System.out.println("OverFlow\nProgram Terminated\n");
	      System.exit(1);
	    }

	    System.out.println("Inserting " + x);
	    a[++top] = x;
	  }

	public int pop() {
	    if (isEmpty()) {
	      System.out.println("STACK EMPTY");
	      System.exit(1);
	    }
	    return a[top--];
	  }
	
	 public boolean isFull()
	 {
		 return top==capcity-1;
	 }
	 
	 public int Size()
	 {
		 return top+1;
	 }
	 
	 public void printStack()
	 {
		 for(int i=0; i<=top; i++)
		 {
			 System.out.println(a[i]+" ");
		 }
	 }
	 
	 
}


public class MainStack {

	public static void main(String[] args) {
		
		 Stack s = new Stack(100);
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s.push(40);
	        s.push(50);
	        s.push(60);
	        s.pop();
	        s.printStack();
	       System.out.println("Size of Stack is :-"+ s.Size());
	}

}

package com.QueueTest;

import java.util.Scanner;

public class Queue  {
	Scanner sc =new Scanner(System.in);

	int Size=sc.nextInt();
//	 Size=10;
	int items[]=new int[Size];
	int front,rear;
	
	Queue()
	{
		front=-1;
		rear=-1;
	}
	
	// check if the queue is full
	boolean isFull()
	{
		if(front==0 && rear==Size-1)
			return true;
		
		return false;
	}
	
	// check if the queue is empty
	boolean isEmpty()
	{
		if(front ==-1)
			return true;
		else
		return false;
	}
	
	void enqueue(int Element)
	{
		if(isFull())
			System.out.println("Queue is Full.");
		
		if(front==-1)
		{
			front=0;
		}
		rear++;
		items[rear]=Element;
		System.out.println("Insert    "+Element);
		}
	
	int dequeue()
	{
		int Element;
		
		if (isEmpty()) {
		      System.out.println("Queue is empty");
		      return (-1);
		    }
		else {
			Element = items[front];
			
			if(front >=rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
			System.out.println("Deleted    "+Element);
		}
		return (Element);
		}
			
		void display()
		{
			int i; 
			if(isEmpty())
				System.out.println("Empty Queue");
			else
				System.out.println("front index   "+front);
		
			System.out.println("Items   ");
			for(i=front; i<=rear; i++)
						System.out.println(items[i]);
		
			System.out.println("rear index   "+rear);
		}	
	

	public static void main(String[] args) {
	
		System.out.println("Enter Size first:-");
		Queue q=new Queue();
		q.dequeue();
		
		for(int i=0; i<6; i++)
			q.enqueue(i);

	q.enqueue(6);
		
		
	q.display();
	
	q.dequeue();
	
	q.display();
	}

}

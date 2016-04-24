package StacksQueuesAssignment;
import java.util.*;

public class QueueUsing2Stacks  {
	Stack<Integer> inbox=new Stack<Integer>();
	Stack<Integer> outbox=new Stack<Integer>();
	int length=0;
	public  int dequeue() throws QueueUnderFlowException{
		if(length<=0)
		{
			throw new QueueUnderFlowException(); 
		}
		int toRet=0;
		for(int i=0;i<length;i++)
		{
			outbox.push(inbox.pop());
		}
		toRet=outbox.pop();
		length=length-1;
		for(int i=0;i<length;i++)
		{
			inbox.push(outbox.pop());
		}
		
		return toRet;
	}
	public  void enqueue(int element)
	{
		inbox.push(element);
		length++;
	}
	public boolean isEmpty() 
	{
		return length==0;
	}
	public int top()throws QueueUnderFlowException
	{
		if(length<=0)
		{
			throw new QueueUnderFlowException(); 
		}
		int toRet=0;
		for(int i=0;i<length;i++)
		{
			outbox.push(inbox.pop());
		}
		toRet=outbox.pop();
		outbox.push(toRet);
		for(int i=0;i<length;i++)
		{
			inbox.push(outbox.pop());
		}
		return toRet;
	}
	public static void main(String[] args) throws QueueUnderFlowException{
		// TODO Auto-generated method stub
		QueueUsing2Stacks queue=new QueueUsing2Stacks();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue.top());
		queue.dequeue();
		System.out.println(queue.top());
		queue.dequeue();
		System.out.println(queue.top());
		queue.dequeue();
		System.out.println(queue.top());
		

	}

}

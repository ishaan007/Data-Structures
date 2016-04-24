package StacksQueuesAssignment;
import java.util.*;

public class StackUsingQueues  {
	Queue<Integer> inbox=new LinkedList();
	Queue<Integer> outbox=new LinkedList();
	int len;
	public void push(int element)
	{
		inbox.add(element);
		
		len++;
	}
	public int pop() throws StackUnderFlowException
	{
		if(len<=0)
		{
			throw new StackUnderFlowException();
		}
		int toret =0;
		for(int i=0;i<len;i++)
		{
			toret=inbox.remove();
			if(i!=len-1)
			{
			outbox.add(toret);
			}
			
		}
		len--;
		for(int i=0;i<len;i++)
		{
			inbox.add(outbox.remove());
		}
		return toret;
	}
	public int top() throws StackUnderFlowException
	{
		if(len<=0)
		{
			throw new StackUnderFlowException();
		}
		int toret =0;
		for(int i=0;i<len;i++)
		{
			toret=inbox.remove();
			outbox.add(toret);

			
		}
		for(int i=0;i<len;i++)
		{
			inbox.add(outbox.remove());
		}
		return toret;
	}
	public boolean isEmpty()
	{
		return len==0;
	}
	
	
	public static void main(String[] args) throws StackUnderFlowException{
		// TODO Auto-generated method stub
		StackUsingQueues stack=new StackUsingQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
		stack.pop();
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
		stack.pop();
		
		
		

	}

}

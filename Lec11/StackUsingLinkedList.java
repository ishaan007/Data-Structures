package Lec11;

import java.util.Stack;

public class StackUsingLinkedList  {
	private int size;
	public Node<Integer>head;
	//private int nextIndex;
	
	
	public void push (int element)
	{
		if(size==0)
		{
			head=new Node<Integer>(element);
			size++;
		}
		else
		{
		Node<Integer>tmp=new Node<Integer>(element);
		tmp.setNext(head);
		head=tmp;
		size++;
		}
	}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public int pop() throws StackUnderflowException
	{
		
		if(size==0)
		{
			System.out.println(size);
			StackUnderflowException ob=new StackUnderflowException();
			throw ob;
		}
		
		
		int tmpdata=head.getData();
		head=head.getNext();
		size--;
		return tmpdata;
	}
	public int top() throws StackUnderflowException
	{
		if(size==0)
		{
			StackUnderflowException ob=new StackUnderflowException();
			throw ob;
		}
		
		return head.getData();
	}
	public  void printList()
	{
		Node<Integer> orhead=head;
		while(orhead!=null)
		{
			System.out.print(orhead.getData()+" ->");
			orhead=orhead.getNext();
		
		}
		System.out.println("");
	}
	public boolean checkBalanced(String expression) throws StackUnderflowException
	{
		try
		{
		StackUsingLinkedList stack=new StackUsingLinkedList();
		for(int i=0;i<expression.length();i++)
		{
			if(expression.charAt(i)=='('||expression.charAt(i)=='{'||expression.charAt(i)=='[')
			{
				stack.push(expression.charAt(i));
			}
			if(expression.charAt(i)==')'||expression.charAt(i)=='}'||expression.charAt(i)==']')
			{
				if((char)stack.pop()!=expression.charAt(i))
				{
					System.out.println("not equal");
					return false;
				}
			}
		}
		
		return true;
		}
		catch(StackUnderflowException ob)
		{
			System.out.println("from exception");
			return false;
		}
	}

	public static void main(String[] args) throws StackUnderflowException {
		// TODO Auto-generated method stub
		/*StackUsingLinkedList stack=new StackUsingLinkedList();
		//test push
		stack.push(10);
		stack.push(15);
		stack.printList();
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println("is empty "+stack.isEmpty());
		System.out.println("top is "+stack.top());
		stack.pop();
		System.out.println("is empty "+stack.isEmpty());
		//System.out.println("top is "+stack.top());
		stack.printList();
		*/
		StackUsingLinkedList stack=new StackUsingLinkedList(); 
		System.out.println(stack.checkBalanced("{a+[b+(c+d)]+(e+f)}"));
		
	

	}

}

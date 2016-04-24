package Lec11;
import java.util.*;

public static class CheckBal {
	public boolean checkBalanced(String expression) throws StackUnderflowException
	{
		try
		{
		Stack stack=new Stack();
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}

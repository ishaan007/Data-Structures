package StacksQueuesAssignment;
import java.util.*;

public class BalancedParanthesis {
	static Stack<Character> stack=new Stack<Character>();
	
	public static boolean checkBalanced(String string)
	{
		for(int i=0;i<string.length();i++)
		{
			char current=string.charAt(i);
			if(current=='('||current=='{'||current=='[')
			{
				stack.push(current);
			}
			if(current==')')
			{
				if(stack.size()<=0||stack.peek()!='(')
				{
					return false;
				}
				stack.pop();
			}
			if(current=='}')
			{
				if(stack.size()<=0||stack.peek()!='{')
				{
					return false;
				}
				stack.pop();
			}
			if(current==']')
			{
				if(stack.size()<=0||stack.peek()!='[')
				{
					return false;
				}
				stack.pop();
			}
		}
		if(stack.size()!=0)
		{
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkBalanced("{(a)+[b]}-((a+b)))"));
		System.out.println(checkBalanced("}"));

	}

}

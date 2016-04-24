package Lec11;

public class Ques9Palindrome extends LinkedList {
	
	public static int getLength(Node<Integer> head)
	{
		int counter=1;
		while(head!=null)
		{
			head=head.getNext();
			counter++;
			
		}
		return counter-1;
	}
	
	
	public static boolean checkPalindrome(Node<Integer> head)
	{
		if(head.getNext()==null||head==null)
		{
			return true;
		}
		int len=getLength(head);
		int mid=len/2;
		int useMid=len/2;
		int counter=1;
		mid = (len%2==0) ? mid :mid+1;
		Node<Integer>middle=head;
		while(counter!=mid)
		{
			middle=middle.getNext();
			counter++;
			
		}
		for(int i=1;i<=useMid;i++)
		{
			//from middle
			Node<Integer>fromMid=middle;
			for(int j=0;j<i;j++)
			{
				fromMid=fromMid.getNext();
			}
			//from start
			Node<Integer>fromHead=head;
			for(int j=0;j<useMid-i;j++)
			{
				fromHead=fromHead.getNext();
			}
			if(fromHead.getData()!=fromMid.getData())
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		boolean result=checkPalindrome(head);
		System.out.println("Palindrome ? "+result);
	}
}

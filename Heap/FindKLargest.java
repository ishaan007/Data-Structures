package Heap;

import java.util.PriorityQueue;

public class FindKLargest {
	
	public static int[] findKL(int[]input,int k)
	{
		PriorityQueue<Integer>hp=new PriorityQueue<>();
		for(int i=0;i<k;i++)
		{
			hp.add(input[i]);
		}
		for(int i=k;i<input.length;i++)
		{
			int toRemove=hp.remove();
			if(input[i]>toRemove)
			{
				hp.add(input[i]);
			}
			else
			{
				hp.add(toRemove);
			}
		}
		int [] toRet=new int[k];
		for(int i=0;i<k;i++)
		{
			toRet[i]=hp.remove();
		}
		return toRet;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={10,8,9,11,6,3,9,5};
		int k=5;
		int[] output=findKL(input, k);
		System.out.println(k+" largest are");
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}

	}

}

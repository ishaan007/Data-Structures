package Heap;

import java.util.PriorityQueue;

public class kDistanceSorted {
	
	public static int[] kSortedDist(int[]input,int k)
	{
		PriorityQueue<Integer>helper=new PriorityQueue<>();
		for(int i=0;i<k;i++)
		{
			helper.add(input[i]);
		}
		
		int[] output=new int[input.length];
		int counter=0;
		for(int i=k;i<input.length;i++)
		{
			int toRem=helper.remove();
			if(input[i]<toRem)
			{
				output[counter]=input[i];
				counter++;
				helper.add(toRem);
			}
			else
			{
				output[counter]=toRem;
				counter++;
				helper.add(input[i]);
			}
		}
		for(int j=0;j<k;j++)
		{
			output[counter]=helper.remove();
			counter++;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={2,4,1,6,3,5};
		int k=2;
		int[] output=kSortedDist(input, k);
		System.out.println(k+" largest are");
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}


	}

}

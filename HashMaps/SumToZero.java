package HashMaps;

import java.util.*;

public class SumToZero {
	public static void sumZero(int[]input)
	{
		HashMap<Integer, Integer>helper=new HashMap<>();
		for(int element:input)
		{
			if(helper.containsKey(element))
			{
				helper.put(element, helper.get(element)+1);
				if(helper.containsKey(-1*element))
				{
				for(int i=0;i<helper.get(-1*element);i++)
				{
					System.out.println(element+" , "+(-1*element));
				}
				}
			}
			else
			{
				helper.put(element, 1);
				if(helper.containsKey(-1*element))
				{
				for(int i=0;i<helper.get(-1*element);i++)
				{
					System.out.println(element+" , "+(-1*element));
				}
			}
		}
		}
	}
		
		
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input={2,0,0,2,2,-2,0,2};
		sumZero(input);
		

	}

}

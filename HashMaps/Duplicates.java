package HashMaps;
import java.util.*;

public class Duplicates {
	
	public static  ArrayList<Integer> removeDuplicates(int[]input)
	{
		HashMap<Integer, Integer>map=new HashMap<>();
		ArrayList<Integer>output=new ArrayList<>();
		for(int element:input)
		{
			if(!map.containsKey(element))
			{
				map.put(element, element);
				output.add(element);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={1,1,1,1,1,3,4,5,5,6,6,7,8};
		ArrayList<Integer>output=removeDuplicates(input);
		for(Integer element:output)
		{
			System.out.println(element);
		}
	

	}

}

package HashMaps;

import java.util.*;
public class HashMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>map=new HashMap<>();
		map.put("this", 1);
		map.put("this",2);
		System.out.println(map.get("this"));
		System.out.println(map.remove("this"));
		System.out.println(map.get("this"));
		

	}

}

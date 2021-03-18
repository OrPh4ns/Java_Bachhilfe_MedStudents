package Collection;

import java.util.HashMap;

public class Map {
	
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("ali", 345);
		map.put("sarah",123);
		System.out.println(map.get("ali"));
	}

}

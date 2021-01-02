package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
			
		map.put("Myname", "Rahul");
		map.put("Myjob", "qa");
		map.put("myrole", "testing");
	
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			
			System.out.println(key+":"+map.get(key));
		}
		
		
		
		System.out.println(map);

	}

}

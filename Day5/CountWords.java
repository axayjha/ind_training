import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		String inp = "In this one, we think we've reached the main verv when we get to \"raced\","
				+ " but instead we are still the one in think" ;
		String arr[] = inp.split(" ");
		//System.out.println(arr[0]);
		for(String s: arr) {
			if(map.containsKey(s))			{	
				int n=map.get(s);
				map.put(s, n+1);
			}
			else map.put(s, 1);
		}
		System.out.println(map);
	}

}

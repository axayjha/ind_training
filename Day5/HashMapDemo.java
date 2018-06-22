import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> obj = new HashMap<>();
		obj.put(1,  "one");
		obj.put(2, "two");
		obj.put(3, "two");
		obj.put(1, "newone");
		
		System.out.println(obj.get(2));
		
		Collection<String> keys = obj.values();
		keys.forEach(System.out::println);
		

	}

}

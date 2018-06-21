import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List data = new ArrayList();
		// list is an interface, so can't instantiate List
		data.add(5.6);
		data.add("Hello");
		data.add(007);
		data.add(true);
		
		System.out.println(data);
		System.out.println(data.get(0));
		
		// ceremonial code
		for (int i = 0; i < data.size(); ++i)
			System.out.println(data.get(i));
		
		for (Object o: data) {
			System.out.println(o);
		}
		
	
	}

}

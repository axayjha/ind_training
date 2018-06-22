
import java.util.*;
public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List data = new ArrayList();
		
		data.add("jon snow");
		data.add("ned stark");
		String s1 = (String)data.get(0);
		System.out.println(s1.toUpperCase());
		
		List <String> data1 = new ArrayList(); //making the data structure homogeneous
		data1.add("Jon snow");
		System.out.println(data1.get(0).toUpperCase());
		
		
	}

}

import java.util.*;
public class NonDupWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "In this one, we think we've reached the main verv when we get to \"raced\","
				+ " but instead we are still the one in think" ;
		String arr[] = inp.split(" ");
		//System.out.println(arr[0]);
		Set set = new HashSet();
		for(String s: arr)	{
			set.add(s.toLowerCase());
		}
		System.out.println(set);
	}

}

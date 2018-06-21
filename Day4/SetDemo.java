import java.util.Set;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("Hello");
		set.add("Hello");
		for (Object o : set) {
			System.out.println(o);
		}
	}

}

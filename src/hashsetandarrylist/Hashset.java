package hashsetandarrylist;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set<Integer>s=new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		//duplicate removed
		s.add(4);
		for(Integer temp:s)
		{
			System.out.println(temp);
		}

	}

}

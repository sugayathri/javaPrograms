package hashsetandarrylist;

import java.util.ArrayList;
import java.util.List;

public class ListAndSet {

	public static void main(String[] args) {
		int n=5;
		List<Integer>l=new ArrayList<Integer>(n);
	for(int i=1;i<=n;i++)
	{
		l.add(i);
		
	}
	System.out.println(l);
	l.remove(3);
	System.out.println(l);
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
	}

}

package collectionPrograms;

import java.util.SortedSet;
import java.util.TreeSet;

public class p11 {
public static void main(String[] args) {
	SortedSet<String> t =new TreeSet<String>();
	t.add("Disha");
	t.add("Thamnaha");
	t.add("Deepika");
	t.add("Katrina");
	t.add("Disha");
	t.add("Pooja");
	t.add("Disha");
	t.add("Anushaka");
	System.out.println(t);
	System.out.println(t.last());
	System.out.println(t.first());
	
	
}
}

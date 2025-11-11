package collectionPrograms;

import java.util.HashSet;
import java.util.Set;

public class p10 {
public static void main(String[] args) {
	Set h = new HashSet();
	h.add("Disha");
	h.add(100);
	h.add(25.f);
	h.add(true);
	h.add(123.456d);
	h.add("Disha");
	h.add(null);
	h.add(null);
	System.out.println(h);
}
}

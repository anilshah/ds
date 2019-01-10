package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class SetMain {

	public static void main(String[] args) {
		HashSet<Integer> sh = new HashSet<>();
		sh.add(23);
		sh.add(67);
		sh.add(1);
		sh.add(8);
		sh.add(8);
		System.out.println(sh);

	}

}

public class Set {

	public static void main(String[] args) {
		HashMap<Integer, String> mp = new HashMap<>();
		mp.put(1, "java");
		mp.put(3,"Android");
		mp.put(2, "php");
		//System.out.println(mp.get(3));
		java.util.Set<Integer> s = mp.keySet();
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()){
			System.out.println(mp.get(itr.next()));
		}
		System.out.println(mp);
	}

}

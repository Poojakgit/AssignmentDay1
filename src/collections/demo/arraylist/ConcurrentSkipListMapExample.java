package collections.demo.arraylist;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {

	public static void main(String[] args) {

		ConcurrentSkipListMap<String, String> concurrentSkipListMap = new ConcurrentSkipListMap<>();
		concurrentSkipListMap.put("1111", "AAAAA");
		concurrentSkipListMap.put("22222","BBBBB");
		System.out.println("Keyset is "+ concurrentSkipListMap.keySet());
		
		System.out.println("Entry set is "+concurrentSkipListMap.entrySet());
		NavigableSet<String> navigableSet= concurrentSkipListMap.keySet();
		Iterator<String> itr= navigableSet.iterator();
		while(itr.hasNext()) {
			String s1=itr.next();
			if(concurrentSkipListMap.get(s1).equals("AAAAA")) {
				itr.remove();
			}
		}
		
		System.out.println("Entry set is "+concurrentSkipListMap.entrySet());
	}

}

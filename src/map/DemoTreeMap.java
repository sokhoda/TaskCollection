package map;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class DemoTreeMap {
	public static void main(String[] args) {
		NavigableMap<Integer, String> map = new TreeMap<>();
		map.putIfAbsent(32, "3");
		System.out.println(map);
		map.replace(32, "3", "1");
		System.out.println(map);
		map.put(1, "36");
		map.put(0, "35");
		map.put(10, "38");
		map.put(12, "18");
		map.put(-10, "48");
		System.out.println(map.entrySet());
		System.out.println(map);
		System.out.println(map.ceilingKey(11) + "<- map.ceilingKey(11)");
		System.out.println(map.lowerEntry(10) + "<- map.lowerEntry(10)");
		System.out.println(map.higherEntry(10) + "<- map.higherEntry(10)");
		System.out.println(map.floorEntry(10) + "<- map.floorEntry(10)");
		System.out.println(map.ceilingEntry(10) + "<- map.ceilingEntry(10)");
		System.out.println(map.headMap(10) + "<- map.headMap(10)");
		System.out.println(map.tailMap(10) + "<- map.tailMap(10)");
		System.out.println(map.subMap(0, true, 10, true).entrySet()
				+ "<- map.subMap(0, true, 10, true)");
		System.out.println(map.navigableKeySet().descendingSet());
		System.err.println(map.values());

		Map<String, DemoTreeMap> testMap = new TreeMap<>(
				new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						return o1.length() - o2.length();
					}
				});
	}
}

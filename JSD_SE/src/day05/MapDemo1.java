package day05;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		/*
		 * V put(K k,V v) 将给定的key-value对存入map
		 */
		Integer value = map.put("英语", 333);
		map.put("语文", 32);
		map.put("数学", 323);
		map.put("英语", 332);
		// 如果可以已有，则value值被替换，返回值为被替换的值，若没有，返回值为null
		int value2 = map.put("英语", 333);
		System.out.println(value);
		map.put("物理", 132);
		System.out.println(map);

		/*
		 * get get(K k) 根据给定的Key获取对应的值，若map中无key则返回null
		 */
		value = map.get("语文");
		// value2 = map.get("32");空指针异常
		System.out.println(value);
		System.out.println(value2);
		/*
		 * V remove(K k) 删除给定的key所对应的key-value对。返回值为被删除的value值
		 */
		value = map.remove("语文");
		System.out.println(map);
		System.out.println(value);

	}
}

package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历Map的三种方式 1.遍历所以key 2.遍历所有key-value 3.遍历所有value（不常用）
 * 
 * @author 张新华
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(10000000);
		map.put("语文", 32);
		map.put("数学", 323);
		map.put("英语", 332);
		System.out.println(map);
		/*
		 * 遍历所有的key Set<K> keySet() 该方法会将map中所有的key存放到一个set集合后返回。那么遍历该集合等于遍历key
		 */
		Set<String> setKey = map.keySet();
		for (String str : setKey) {
			System.out.println(str);
		}
		/*
		 * 遍历每组键值对 Map中每组键值对都由Map的内部类：java.util.Map.Entry的一个实例表示。
		 * Entry有两个方法：getKey，getValue，可以分别获取这组键值对的值
		 * 
		 * set<Entry> entrySet 将每一组键值对（Entry实例）存入Set返回
		 */
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			System.out.print(e.getKey());
			System.out.println(e.getValue());
		}

		/*
		 * 遍历所有value Collection values（） 该方法会将当前map中所有的value存入一个集合返回
		 */
		Collection<Integer> c = map.values();
		for (Integer i : c) {
			System.out.println(i);
		}
	}
}

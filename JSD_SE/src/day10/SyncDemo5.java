package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 将集合或map转换为线程安全的
 * 
 * @author 张新华
 *
 */
public class SyncDemo5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		System.out.println(list);
		list = Collections.synchronizedList(list);
		System.out.println(list);
	}
}

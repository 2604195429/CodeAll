package day01;

/**
 * int indexOf（String str） 该方法使用来查找给定字符串在当前字符串 中的位置。该方法有几个重载方法。
 * 
 * @author 张新华
 *
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String str = "thinking in java";
		// 查找in在str字符串中的位置，若没有会返回-1.
		int index = str.indexOf("in");
		System.out.println("index:" + index);
		/*
		 * 重载方法允许从指定位置处开始查找
		 */
		index = str.indexOf("in", 3);
		System.out.println("index:" + index);
		/*
		 * 查找最后一次出现指定字符串的位置。
		 */
		index = str.lastIndexOf("in");
		System.out.println("index:" + index);

	}

}

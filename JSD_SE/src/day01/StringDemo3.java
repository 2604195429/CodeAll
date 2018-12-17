package day01;

/**
 * String substring(int start, int end) 截取字符串，从指定位置（start）开始截取到指定的位置（end） java
 * qpi有一个特点，通常用两个数字表示范围时，都是含头不含尾的
 * 
 * @author 张新华
 *
 */
public class StringDemo3 {

	public static void main(String[] args) {
		String str = "thinking in java";
		// 截取"ing"
		String sub = str.substring(5, 8);
		System.out.println("sub:" + sub);
		String host = "www.tedu.cn";
		// sub = host.substring(4,8);
		/*
		 * 若只穿一个参数，这是从指定的位置开始 截取到字符串末尾
		 */
		sub = host.substring(4);
		System.out.println("sub:" + sub);
	}

}

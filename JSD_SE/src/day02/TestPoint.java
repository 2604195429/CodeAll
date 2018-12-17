package day02;

/**
 * 测试Point重写Object相关方法
 * 
 * @author 张新华
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		// String str = p1.toString();
		/*
		 * System.out.println(Object obj) 输出的是给定对象toString返回的字符串
		 */
		System.out.println(p1);

		Point p2 = new Point(1, 2);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}
}

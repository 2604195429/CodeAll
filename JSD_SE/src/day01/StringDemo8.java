package day01;

/**
 * String提供了若干重载的静态方法 static String valueOf(XXX xxx) 该方法的作用是将java中其他类型转换为字符串。
 * 
 * @author 张新华
 *
 */
public class StringDemo8 {

	public static void main(String[] args) {
		int a = 1;
		String strA = String.valueOf(a);
		System.out.println(strA + 1);
		double d = 1.1;
		String strB = String.valueOf(d);
		System.out.println(strB + 1);
	}

}

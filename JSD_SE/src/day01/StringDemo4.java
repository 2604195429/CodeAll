package day01;

/**
 * 去除当前字符串两边的空白字符
 * 
 * @author 张新华
 *
 */
public class StringDemo4 {

	public static void main(String[] args) {
		String str = "   hello  zhang";
		String trim = str.trim();
		System.out.println(str);
		System.out.println(trim);
	}

}

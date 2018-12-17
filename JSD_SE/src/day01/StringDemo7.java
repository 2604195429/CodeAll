package day01;

/**
 * String toUpperCase() String toLowerCase() 将当前字符串的英文转换为全大写或全小写
 * 
 * @author 张新华
 *
 */
public class StringDemo7 {

	public static void main(String[] args) {
		String str = "wo爱java";
		String upper = str.toUpperCase();
		System.out.println(upper);

		String lower = str.toLowerCase();
		System.out.println(lower);
	}

}

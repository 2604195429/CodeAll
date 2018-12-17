package day01;

/**
 * boolean startsWith(String str) boolean endsWith(String str)
 * 判断当前字符串是否是以指定的字符串开始或结尾的。
 * 
 * @author 张新华
 *
 */
public class StringDemo6 {

	public static void main(String[] args) {
		String str = "thinking in java";
		boolean starts = str.startsWith("thi");
		System.out.println(starts);
		boolean ends = str.endsWith("java");
		System.out.println("ends:" + ends);
	}

}

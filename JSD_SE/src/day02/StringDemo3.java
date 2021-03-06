package day02;

/**
 * 字符串支持正则表达式三： String replaceAll(String regex, String str)
 * 将当前字符串中满足正则表达式的部分替换给定字符串
 * 
 * @author 张新华
 *
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String str = "abc134def456ghi789";
		/*
		 * 将数字部分替换为"#NUMBER#"
		 */
		str = str.replaceAll("\\d+", "#NUMBER");
		System.out.println(str);
	}
}

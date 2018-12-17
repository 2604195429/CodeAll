package day02;

/**
 * 字符串支持正则表达式方法一： boolean matchess(String regex)
 * 根据给定的正则表达式验证当前字符串是否满足格式要求，满足则返回true，否则返回false。
 * 
 * @author 张新华
 *
 */
public class StringDemo1 {
	public static void main(String[] args) {
		/*
		 * 电子邮箱正则表达式：[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z0-9_]+)+
		 */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)+";
		String mail = "afsdfsa@fafa.cn";
		boolean flag = mail.matches(regex);
		System.out.println(flag);
	}
}

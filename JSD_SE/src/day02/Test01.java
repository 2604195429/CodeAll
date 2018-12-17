package day02;

/**
 * 验证手机号的正则表达式
 * 
 * @author 张新华
 *
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 要求用户输入一个手机号，然后经过 验证输出是否是手机号码。
		 */
		String regex = "(\\\\+86|0086)?\\s*1[0-9]{10}";
		String str = "\\+86   12123123131";
		System.out.println(str);
		System.out.println(regex);
		System.out.println(str.matches(regex));
	}

}

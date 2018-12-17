package day02;

/**
 * 包装类提供了一个静态方法parseXXX（String str） 可以将给定的字符串转换为对应的基本类型。
 * 前提是该字符串必须正确的描述基本类型可以保存的值
 * 
 * @author 张新华
 *
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		String str = "123.1231";
//		int i = Integer.parseInt(str);
//		System.out.println(i + 1);
		double d = Double.parseDouble(str);
		System.out.println(d + 1);
	}
}

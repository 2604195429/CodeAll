package day08;

/**
 * 捕获异常
 * 
 * @author 张新华
 *
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("程序开始");
		try {
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
		} catch (NullPointerException e) {
			System.out.println("出现了空指针");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串下标越界");
		} catch (Exception e) {
			System.out.println("有异常");
		}
		System.out.println("程序结束");
	}
}

package day08;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("程序开始");
		try {
			String str = "a";
			// System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			System.out.println("有异常");
		} finally {
			System.out.println("finally代码执行了");
		}
		System.out.println("程序结束");
	}
}

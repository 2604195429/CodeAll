package day08;

/**
 * Exception常用方法
 * 
 * @author 张新华
 *
 */
public class ExceptionDemo5 {
	public static void main(String[] args) {
		System.out.println("程序开始");
		try {
			String str = "adc";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("程序结束");
	}
}

package day08;

/**
 * Exception���÷���
 * 
 * @author ���»�
 *
 */
public class ExceptionDemo5 {
	public static void main(String[] args) {
		System.out.println("����ʼ");
		try {
			String str = "adc";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("�������");
	}
}

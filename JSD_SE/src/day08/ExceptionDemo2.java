package day08;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("����ʼ");
		try {
			String str = "a";
			// System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			System.out.println("���쳣");
		} finally {
			System.out.println("finally����ִ����");
		}
		System.out.println("�������");
	}
}

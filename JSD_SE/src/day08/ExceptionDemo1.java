package day08;

/**
 * �����쳣
 * 
 * @author ���»�
 *
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("����ʼ");
		try {
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
		} catch (NullPointerException e) {
			System.out.println("�����˿�ָ��");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("�ַ����±�Խ��");
		} catch (Exception e) {
			System.out.println("���쳣");
		}
		System.out.println("�������");
	}
}

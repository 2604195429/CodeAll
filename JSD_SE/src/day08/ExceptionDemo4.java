package day08;

/**
 * �����쳣���׳�
 * 
 * @author ���»�
 *
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setAge(2000);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���䣺" + p.getAge());
	}
}

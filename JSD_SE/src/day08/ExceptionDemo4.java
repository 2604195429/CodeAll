package day08;

/**
 * 测试异常的抛出
 * 
 * @author 张新华
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
		System.out.println("年龄：" + p.getAge());
	}
}

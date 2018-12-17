package day08;

import javax.management.RuntimeErrorException;

/**
 * ����throw��throws
 * 
 * @author ���»�
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException {
		if (age < 0 || age > 100) {
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}

}

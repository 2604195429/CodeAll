package day03;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e) �򼯺������Ԫ�ء� ��Ԫ����ӳɹ�����true�����򷵻�false
		 */
		c.add("32");
		c.add("32");
		c.add("32");
		c.add("32");
		System.out.println(c);
		/*
		 * int size() ���ؼ���Ԫ�صĸ���
		 */
		System.out.println(c.size());
		/*
		 * boolean isEmpty() �жϵ�ǰ�����Ƿ�Ϊ��
		 * 
		 */
		System.out.println(c.isEmpty());
		/*
		 * void clear() �������Ԫ��
		 */
		c.clear();
		System.out.println(c.isEmpty());
	}

}

package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		// ��ȡ��ǰ���ϵĵ�����
		Iterator it = c.iterator();
		/*
		 * boolean hasNest() �ʵĹ��� �÷����жϼ������Ƿ���Ԫ�ؿ���ȡ��
		 * 
		 * E next() ȡ�ù��� ��ȡ��������һ��Ԫ��
		 */
		while (it.hasNext()) {
			String str = (String) it.next();
			if ("#".equals(str)) {
				/*
				 * ʹ�õ�����ʱ����Ҫʹ�ü��ϵ���ɾ������ᷢ���쳣
				 */
				// c.remove(str);
				/*
				 * �������ṩ��remove����ɾ��ȡ����Ԫ��
				 */
				it.remove();
			}
			System.out.println(str);
		}
		System.out.println(c);
	}
}

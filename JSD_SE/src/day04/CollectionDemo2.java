package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ������������
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c++");
		c1.add(".net");
		c1.add("linux");
		System.out.println(c1);
		Collection c2 = new HashSet();
		c2.add("android");
		c2.add("ios");
		c2.add("linux");
		c2.add("linux");// ����false����ͬ
		System.out.println(c2);
		/*
		 * ȡ���� boolean addAll(Collection c) ����������������Ԫ����ӵ���ǰ������ ��Ӻ�ֻҪ��ǰ�������������仯���򷵻�true
		 */
		boolean flag = c1.addAll(c2);
		System.out.println(c1);
		System.out.println(flag);

		/*
		 * boolean containsAll(Collection c) �жϵ�ǰ�����Ƿ�����������ϵ�����Ԫ��
		 */
		System.out.println(c2.containsAll(c1));
	}
}

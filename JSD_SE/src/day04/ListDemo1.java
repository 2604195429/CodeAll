package day04;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		/*
		 * E set(int index,E e) ������Ԫ�������ڸ���λ���� ����ֵΪԭ��Ԫ�ء��������滻Ԫ�ز���
		 */
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		String old = list.set(2, "5");
		System.out.println(list);
		System.out.println(old);
		// list.set(4, "23");//��ôд���±�Խ��
		/*
		 * E get��int index�� ��ȡ�����±��Ӧ��Ԫ��
		 */
		String str = list.get(2);
		System.out.println(str);
	}

}

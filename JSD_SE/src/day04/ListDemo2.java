package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * list�����ṩһ������add,remove���� void add��int index��E e�� ������Ԫ�ز嵽����λ��
 * 
 * E remove��int index�� ɾ��ָ��λ�õ�Ԫ�أ������䷵��
 * 
 * @author ���»�
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("4");
		list.add(2, "3");
		System.out.println(list);
		String str = list.remove(2);
		System.out.println(str);
		System.out.println(list);
	}
}

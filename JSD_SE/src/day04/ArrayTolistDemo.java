package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת���� ת��ֻ��תlist���� תset���ܶ�ʧԪ��
 */
public class ArrayTolistDemo {
	public static void main(String[] args) {
		String[] array = new String[] { "1", "2", "3", "4" };
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		/*
		 * �򼯺����һ��Ԫ��
		 * 
		 * ��������׳��쳣 ԭ��ü���������ת�������ü��ϱ�ʾԭ�������飬�Ըü��ϵĲ��������Ƕ�ԭ���ϵĲ��� ��ô���Ԫ�ص���ԭ�������ݣ��Ͳ��ܱ�ʾԭ����������
		 * ���Բ������򼯺����Ԫ��
		 */
		// list.add("3");
		// System.out.println(list);

		list.set(2, "32");
		System.out.println(list);
		for (String str : array) {
			System.out.println(str);
		}
		/*
		 * ������ɾ
		 */
		// List<String> list1 = new ArrayList<String>();
		// list1.addAll(list);
		/*
		 * ���ƹ�����
		 */
		List<String> list1 = new ArrayList<String>(list);
		list1.add("3");
		System.out.println(list1);
	}
}

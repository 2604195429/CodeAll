package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * ȡ�Ӽ� List SubList��int start��int end�� ��ȡ��ǰ������ָ����Χ���Ӽ���ͬ���Ǻ�ͷ����β
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		// ��ȡ3-7
		List<Integer> subList = list.subList(3, 8);
		// ����ʮ��
		for (int i = 0; i < subList.size(); i++) {
			subList.set(i, subList.get(i) * 10);
		}
		System.out.println(subList);
		/*
		 * �����Ӽ����޸ģ����൱���޸���ԭ���ϵĶ�Ӧ������
		 */
		System.out.println(list);
		/*
		 * ɾ������2-8��Ԫ��
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}

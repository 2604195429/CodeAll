package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����Զ�������Ԫ�صļ���
 */
public class SortListDemo1 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1, 3));
		list.add(new Point(2, 3));
		list.add(new Point(32, 3));
		list.add(new Point(4, 3));
		System.out.println(list);
		/*
		 * sort����Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿ� �ýӿ����ڹ涨ʵ�����ǿ��ԱȽϵ�
		 */
		Collections.sort(list);
		System.out.println(list);

	}
}

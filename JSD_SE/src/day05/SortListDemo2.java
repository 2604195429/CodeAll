package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("��fa");
		list.add("��f");
		list.add("��3");
		System.out.println(list);
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});
		System.out.println(list);
	}
}

/*
 * �������ıȽ���
 * 
 * 
 *
 */
// class MyComparator implements Comparator<String> {
//
// @Override
// public int compare(String o1, String o2) {
// // TODO Auto-generated method stub
// return o1.length() - o2.length();
// }
//
// }

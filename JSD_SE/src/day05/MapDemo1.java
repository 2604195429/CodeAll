package day05;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		/*
		 * V put(K k,V v) ��������key-value�Դ���map
		 */
		Integer value = map.put("Ӣ��", 333);
		map.put("����", 32);
		map.put("��ѧ", 323);
		map.put("Ӣ��", 332);
		// ����������У���valueֵ���滻������ֵΪ���滻��ֵ����û�У�����ֵΪnull
		int value2 = map.put("Ӣ��", 333);
		System.out.println(value);
		map.put("����", 132);
		System.out.println(map);

		/*
		 * get get(K k) ���ݸ�����Key��ȡ��Ӧ��ֵ����map����key�򷵻�null
		 */
		value = map.get("����");
		// value2 = map.get("32");��ָ���쳣
		System.out.println(value);
		System.out.println(value2);
		/*
		 * V remove(K k) ɾ��������key����Ӧ��key-value�ԡ�����ֵΪ��ɾ����valueֵ
		 */
		value = map.remove("����");
		System.out.println(map);
		System.out.println(value);

	}
}

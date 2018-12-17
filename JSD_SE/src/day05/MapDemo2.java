package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����Map�����ַ�ʽ 1.��������key 2.��������key-value 3.��������value�������ã�
 * 
 * @author ���»�
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(10000000);
		map.put("����", 32);
		map.put("��ѧ", 323);
		map.put("Ӣ��", 332);
		System.out.println(map);
		/*
		 * �������е�key Set<K> keySet() �÷����Ὣmap�����е�key��ŵ�һ��set���Ϻ󷵻ء���ô�����ü��ϵ��ڱ���key
		 */
		Set<String> setKey = map.keySet();
		for (String str : setKey) {
			System.out.println(str);
		}
		/*
		 * ����ÿ���ֵ�� Map��ÿ���ֵ�Զ���Map���ڲ��ࣺjava.util.Map.Entry��һ��ʵ����ʾ��
		 * Entry������������getKey��getValue�����Էֱ��ȡ�����ֵ�Ե�ֵ
		 * 
		 * set<Entry> entrySet ��ÿһ���ֵ�ԣ�Entryʵ��������Set����
		 */
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			System.out.print(e.getKey());
			System.out.println(e.getValue());
		}

		/*
		 * ��������value Collection values���� �÷����Ὣ��ǰmap�����е�value����һ�����Ϸ���
		 */
		Collection<Integer> c = map.values();
		for (Integer i : c) {
			System.out.println(i);
		}
	}
}

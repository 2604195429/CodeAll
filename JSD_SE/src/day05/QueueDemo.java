package day05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		/*
		 * LinkedListҲʵ���˶��нӿڣ���Ϊ�����Ա���һ��Ԫ�أ�������β��ɾ�졣���÷��϶��е��ص�
		 */
		Queue<String> queue = new LinkedList<String>();
		/*
		 * boolean offer(E e) ��Ӳ��������β׷��һ����Ԫ��
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		/*
		 * E poll���� �Ӷ��׻�ȡԪ�أ���ȡ���Ԫ�ؾʹӶ�����ɾ����
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		/*
		 * E Peek() ���ö���Ԫ�أ����ǲ������Ӳ���
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);

		System.out.println("������ʼ");
		// for (int i = queue.size(); i > 0; i--) {
		// str = queue.poll();
		// System.out.println(str);
		// }
		while (queue.size() > 0) {
			str = queue.poll();
			System.out.println(str);
		}
	}
}

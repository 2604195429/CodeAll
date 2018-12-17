package day05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		/*
		 * LinkedList也实现了队列接口，因为它可以保存一组元素，而且首尾增删快。正好符合队列的特点
		 */
		Queue<String> queue = new LinkedList<String>();
		/*
		 * boolean offer(E e) 入队操作，向队尾追加一个新元素
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		/*
		 * E poll（） 从队首获取元素，获取后该元素就从队列中删除了
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		/*
		 * E Peek() 引用队首元素，但是不做出队操作
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);

		System.out.println("遍历开始");
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

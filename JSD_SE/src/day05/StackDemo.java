package day05;

import java.util.Deque;
import java.util.LinkedList;

public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		/*
		 * void push(E e) 入栈操作，最后入栈的的元素在栈顶（第一个元素位置）
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);

		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);

		str = stack.peek();
		System.out.println(str);
		System.out.println(stack);

		while (stack.size() > 0) {
			str = stack.pop();
			System.out.println(str);
		}
	}
}

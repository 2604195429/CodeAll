package day01;

import java.util.Scanner;

/**
 * ��дһ������Ҫ���û�����һ����ַ��Ϣ�� ��ʽ�������£� www��baidu��com www��baidu��com��cn
 * http//www.baidu.com
 * 
 * @author ���»�
 *
 */
public class Test01 {

	public static void main(String[] args) {
		System.out.println("������һ����ַ��");
		Scanner scanner = new Scanner(System.in);
		String host = scanner.nextLine();
		// ��ȡ��һ��֮���һ���ַ���λ��
		int start = host.indexOf(".") + 1;
		// ��ȡ�ڶ������λ��
		int end = host.indexOf(".", start);
		String sub = host.substring(start, end);
		System.out.println("������" + sub);

	}

}

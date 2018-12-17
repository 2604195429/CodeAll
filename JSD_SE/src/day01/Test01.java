package day01;

import java.util.Scanner;

/**
 * 编写一个程序，要求用户输入一个网址信息。 格式可是如下： www。baidu。com www。baidu。com，cn
 * http//www.baidu.com
 * 
 * @author 张新华
 *
 */
public class Test01 {

	public static void main(String[] args) {
		System.out.println("请输入一个网址：");
		Scanner scanner = new Scanner(System.in);
		String host = scanner.nextLine();
		// 获取第一点之后第一个字符的位置
		int start = host.indexOf(".") + 1;
		// 获取第二个点的位置
		int end = host.indexOf(".", start);
		String sub = host.substring(start, end);
		System.out.println("域名：" + sub);

	}

}

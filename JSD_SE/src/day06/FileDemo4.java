package day06;

import java.io.File;

/**
 * ����һ����Ŀ¼
 * 
 * @author ���»�
 *
 */
public class FileDemo4 {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼�´���һ����Ϊdemo��Ŀ¼
		 */
		File file = new File("demo");
		if (!file.exists()) {
			file.mkdir();
			System.out.println("����Ŀ¼");
		} else {
			System.out.println("Ŀ¼�Ѵ���");
		}
	}
}

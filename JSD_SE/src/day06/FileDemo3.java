package day06;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * 
 */
public class FileDemo3 {
	public static void main(String[] args) {
		/*
		 * ɾ����ǰ�ļ�Ŀ¼��test.txt�ļ�
		 */

		File file = new File("test.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("ɾ�����");
		} else {
			System.out.println("�ļ�������");
		}
	}

}

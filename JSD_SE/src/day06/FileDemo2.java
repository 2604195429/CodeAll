package day06;

import java.io.File;
import java.io.IOException;

/**
 * ����һ���ļ�
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * ��ǰĿ¼�´���test.txt Ĭ��·��Ϊ��ǰ·��
		 */
		File file = new File("test.txt");
		/*
		 * boolean exists �ж��ļ��Ƿ����
		 */
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("�����ɹ�");
		} else {
			System.out.println("�Ѵ���");
		}
	}
}

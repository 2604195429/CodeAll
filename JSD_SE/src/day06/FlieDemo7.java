package day06;

import java.io.File;

/**
 * ��ȡĿ¼����������
 * 
 * @author ���»�
 *
 */
public class FlieDemo7 {
	public static void main(String[] args) {
		/*
		 * ��ȡĿ¼��ǰ����
		 */
		File dir = new File(".");
		/*
		 * boolean isDirectory() �ж��Ƿ���Ŀ¼ Boolean isFile() �ж��Ƿ����ļ�
		 */
		if (dir.isDirectory()) {
			/*
			 * File [] listFile ��ȡ��������
			 */
			File[] sub = dir.listFiles();
			for (int i = 0; i < sub.length; i++) {
				if (sub[i].isDirectory()) {
					System.out.println("Ŀ¼" + sub[i].getName());
				} else {
					System.out.println("�ļ�" + sub[i].getName());
				}
			}
		}
	}
}

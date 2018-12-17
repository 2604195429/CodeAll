package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * ��ȡĿ¼�з��������Ĳ������� ʹ���ص�listFile��������Ҫ����һ��������ļ������� �ļ���������һ����ڣ�FileFilter
 */
public class FileDemo8 {
	public static void main(String[] args) {
		File dir = new File(".");
		/*
		 * ��ȡ������"."��ͷ������
		 */
		File[] subs = dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				System.out.println("���ڹ���" + pathname);
				return pathname.getName().startsWith(".");
			}
		});

		for (File sub : subs) {
			System.out.println(sub.getName());
		}
	}
}

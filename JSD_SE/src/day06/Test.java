package day06;

import java.io.File;

/**
 * ɾ�������ļ���Ŀ¼
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}

	public static void delete(File file) {
		if (file.isDirectory()) {
			File[] subs = file.listFiles();
			for (File sub : subs) {
				delete(sub);// �ݹ�
			}
		}
		file.delete();
	}
}

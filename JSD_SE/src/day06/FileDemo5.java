package day06;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * 
 * @author ���»�
 *
 */
public class FileDemo5 {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼�´���.\a\b\c\d
		 */
		File file = new File(
				"." + File.separator + "a" + File.separator + "b" + File.separator + "c" + File.separator + "d ");
		if (!file.exists()) {
			/*
			 * mkdirs�����༶Ŀ¼ ���û�и��򴴽��Զ�����
			 */
			file.mkdirs();
			System.out.println("����Ŀ¼");
		} else {
			System.out.println("�Ѵ���");
		}

	}
}

package day06;

import java.io.File;

/**
 * ɾ��Ŀ¼ delete ����ɾ��һ��Ŀ¼����ǰ���Ǹ�Ŀ¼Ϊ��Ŀ¼
 * 
 * @author ���»�
 *
 */
public class FileDemo6 {
	public static void main(String[] args) {
		File dir = new File("demo");
		if (dir.exists()) {
			dir.delete();
			System.out.println("ɾ��");
		}
	}
}

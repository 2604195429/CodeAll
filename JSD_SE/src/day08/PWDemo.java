package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * �����ַ��� �ص��ǿ��԰��ж�д�ַ���
 * 
 * @author ���»�
 *
 */
public class PWDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("pw.txt", "utf-8");
		pw.println("�Ұ�");
		pw.println("��Ҫ");
		pw.close();
	}
}

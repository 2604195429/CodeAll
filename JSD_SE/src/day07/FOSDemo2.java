package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ļ�׷��
 * 
 * @author ���»�
 *
 */
public class FOSDemo2 {
	public static void main(String[] args) throws IOException {
		// �ڶ�������Ϊtrueʱ׷��
		FileOutputStream fos = new FileOutputStream("fos.txt", true);
		fos.write(String.valueOf("fff").getBytes("utf-8"));
	}
}

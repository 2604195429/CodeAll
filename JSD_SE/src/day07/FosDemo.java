package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FosDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("�򿪿���.txt");
		String str = "�Ұ����»�";

		/*
		 * String->byte[] byte getByte(String csn) ָ�����ַ���תΪbyte
		 */
		byte[] data = str.getBytes("utf-8");
		fos.write(data);
		// fos.write(data);
		fos.close();
	}
}

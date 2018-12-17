package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FosDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("打开看看.txt");
		String str = "我爱张新华";

		/*
		 * String->byte[] byte getByte(String csn) 指定的字符集转为byte
		 */
		byte[] data = str.getBytes("utf-8");
		fos.write(data);
		// fos.write(data);
		fos.close();
	}
}

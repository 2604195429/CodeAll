package day07;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BosDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("dos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(new String("ac").getBytes("utf-8"));
		// ǿ�ƴӻ�������д��
		bos.flush();
		bos.close();
	}
}

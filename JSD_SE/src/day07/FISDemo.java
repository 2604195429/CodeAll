package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 输入流，是一个低级文件流，用于读取文件字节
 * 
 * @author 张新华
 *
 */
public class FISDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] data = new byte[100];
		int len = fis.read(data);
		String str = new String(data, 0, len, "utf-8");

		System.out.println(str);
	}
}

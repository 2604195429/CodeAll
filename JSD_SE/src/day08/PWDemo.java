package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符流 特点是可以按行读写字符串
 * 
 * @author 张新华
 *
 */
public class PWDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("pw.txt", "utf-8");
		pw.println("我啊");
		pw.println("我要");
		pw.close();
	}
}

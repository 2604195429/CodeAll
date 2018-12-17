package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件追加
 * 
 * @author 张新华
 *
 */
public class FOSDemo2 {
	public static void main(String[] args) throws IOException {
		// 第二个参数为true时追加
		FileOutputStream fos = new FileOutputStream("fos.txt", true);
		fos.write(String.valueOf("fff").getBytes("utf-8"));
	}
}

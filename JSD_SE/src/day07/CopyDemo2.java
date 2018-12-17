package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("fos_cp.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int d = -1;
		while ((d = bis.read()) != -1) {
			bos.write(d);
		}
		bis.close();
		bos.close();
	}
}

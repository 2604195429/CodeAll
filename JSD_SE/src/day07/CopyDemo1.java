package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author ÕÅÐÂ»ª
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		FileOutputStream fos = new FileOutputStream("fos_cp.txt");
		byte[] data = new byte[1024 * 10];
		int len = -1;
		while ((len = fis.read(data)) != -1) {
			fos.write(data, 0, len);
		}
		fis.close();
		fos.close();
	}
}

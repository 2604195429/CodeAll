package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ������߶�дЧ�ʣ�����ͨ�����ÿ�ζ�д�������������ٶ�д�����ﵽ
 * 
 * @author ���»�
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("photo.png", "r");

		RandomAccessFile desc = new RandomAccessFile("photo_cp.png", "rw");
		/*
		 * int read(byte[] data) �������ֽ�
		 */
		// 10k
		byte[] buf = new byte[1024 * 10];
		int len = -1;
		while ((len = raf.read(buf)) != -1) {
			desc.write(buf, 0, len);
		}
		System.out.println("�������");
		raf.close();
		desc.close();
	}
}

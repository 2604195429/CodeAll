package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/*
		 * void write(int d) д��������intֵ��Ӧ�ĵ�8λ
		 */
		raf.write(1);
		System.out.println("д�����");
		raf.close();
	}
}

package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf1.dat", "rw");

		/*
		 * дint ���ֵ
		 */
		int max = Integer.MAX_VALUE;
		raf.writeInt(max);
		/*
		 * getFilePointer
		 */
		System.out.println(raf.getFilePointer());
		// ���ļ�ĩβ
		/*
		 * void seek (long pos) ָ���ƶ���ָ��λ��
		 */
		raf.seek(0);
		max = raf.readInt();
		System.out.println(max);
		raf.close();
	}
}

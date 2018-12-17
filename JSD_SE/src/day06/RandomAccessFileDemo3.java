package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf1.dat", "rw");

		/*
		 * 写int 最大值
		 */
		int max = Integer.MAX_VALUE;
		raf.writeInt(max);
		/*
		 * getFilePointer
		 */
		System.out.println(raf.getFilePointer());
		// 在文件末尾
		/*
		 * void seek (long pos) 指针移动到指定位置
		 */
		raf.seek(0);
		max = raf.readInt();
		System.out.println(max);
		raf.close();
	}
}

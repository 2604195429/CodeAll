package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/*
		 * void write(int d) 写出给定的int值对应的低8位
		 */
		raf.write(1);
		System.out.println("写入完毕");
		raf.close();
	}
}

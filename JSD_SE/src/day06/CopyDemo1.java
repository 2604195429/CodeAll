package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * 创建一个RAF读取原文件，在创建一个RAF向目标文件中写出，顺序从原文件读取每个字节并写入到目标文件中
		 */
		RandomAccessFile raf = new RandomAccessFile("photo.png", "r");

		RandomAccessFile desc = new RandomAccessFile("photo_cp.png", "rw");
		//用来保存读取的每个字节
		int d = -1;
		while ((d = raf.read()) != -1) {
			desc.write(d);
		}

		System.out.println("复制完毕");
		raf.close();
		desc.close();
	}
}

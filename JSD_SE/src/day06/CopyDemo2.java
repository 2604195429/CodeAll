package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 若想提高读写效率，可以通过提高每次读写的数据量来减少读写次数达到
 * 
 * @author 张新华
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("photo.png", "r");

		RandomAccessFile desc = new RandomAccessFile("photo_cp.png", "rw");
		/*
		 * int read(byte[] data) 读所有字节
		 */
		// 10k
		byte[] buf = new byte[1024 * 10];
		int len = -1;
		while ((len = raf.read(buf)) != -1) {
			desc.write(buf, 0, len);
		}
		System.out.println("复制完毕");
		raf.close();
		desc.close();
	}
}

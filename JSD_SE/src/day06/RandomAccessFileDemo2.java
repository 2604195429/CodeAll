package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文件
 * 
 * @author 张新华
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "r");
		/*
		 * int read() 读取一个字节，并以10进制的int型返回 若返回值为-1，则表示读取文件末尾
		 */
		int d = raf.read();
		System.out.println(d);
	}
}

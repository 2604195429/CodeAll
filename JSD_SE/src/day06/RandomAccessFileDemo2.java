package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ļ�
 * 
 * @author ���»�
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "r");
		/*
		 * int read() ��ȡһ���ֽڣ�����10���Ƶ�int�ͷ��� ������ֵΪ-1�����ʾ��ȡ�ļ�ĩβ
		 */
		int d = raf.read();
		System.out.println(d);
	}
}
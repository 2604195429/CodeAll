package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * ����һ��RAF��ȡԭ�ļ����ڴ���һ��RAF��Ŀ���ļ���д����˳���ԭ�ļ���ȡÿ���ֽڲ�д�뵽Ŀ���ļ���
		 */
		RandomAccessFile raf = new RandomAccessFile("photo.png", "r");

		RandomAccessFile desc = new RandomAccessFile("photo_cp.png", "rw");
		//���������ȡ��ÿ���ֽ�
		int d = -1;
		while ((d = raf.read()) != -1) {
			desc.write(d);
		}

		System.out.println("�������");
		raf.close();
		desc.close();
	}
}

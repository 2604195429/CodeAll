package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Note {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入文件名");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine() + ".txt";
		FileOutputStream fos = new FileOutputStream(name);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		PrintWriter pw = new PrintWriter(osw, true);
		String str;
		do {
			System.out.println("请输入内容");
			str = scanner.nextLine();
			if (!"exit".equals(str)) {
				pw.println(str);
			}
		} while (!"exit".equals(str));
		pw.close();
	}
}

package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PWDemo2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("pw1.txt");

		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		PrintWriter pw = new PrintWriter(osw);

		pw.println("fsda");
		pw.close();
	}
}

package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(new FileInputStream("src/day08/ExceptionDemo3.java"), "utf-8"));
			String b = null;
			while ((b = br.readLine()) != null) {
				System.out.println(b);

			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

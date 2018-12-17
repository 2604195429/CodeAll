package day06;

import java.io.File;

/**
 * 删除给定文件或目录
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}

	public static void delete(File file) {
		if (file.isDirectory()) {
			File[] subs = file.listFiles();
			for (File sub : subs) {
				delete(sub);// 递归
			}
		}
		file.delete();
	}
}

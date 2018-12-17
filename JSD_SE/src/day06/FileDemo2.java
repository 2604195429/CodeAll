package day06;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个文件
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 当前目录下创建test.txt 默认路径为当前路径
		 */
		File file = new File("test.txt");
		/*
		 * boolean exists 判断文件是否存在
		 */
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("创建成功");
		} else {
			System.out.println("已存在");
		}
	}
}

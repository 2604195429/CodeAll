package day06;

import java.io.File;

/**
 * 创建一个新目录
 * 
 * @author 张新华
 *
 */
public class FileDemo4 {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建一个名为demo的目录
		 */
		File file = new File("demo");
		if (!file.exists()) {
			file.mkdir();
			System.out.println("创建目录");
		} else {
			System.out.println("目录已存在");
		}
	}
}

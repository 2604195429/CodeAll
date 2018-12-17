package day06;

import java.io.File;

/**
 * 创建一个多级目录
 * 
 * @author 张新华
 *
 */
public class FileDemo5 {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建.\a\b\c\d
		 */
		File file = new File(
				"." + File.separator + "a" + File.separator + "b" + File.separator + "c" + File.separator + "d ");
		if (!file.exists()) {
			/*
			 * mkdirs创建多级目录 如果没有父则创建自动创建
			 */
			file.mkdirs();
			System.out.println("创建目录");
		} else {
			System.out.println("已创建");
		}

	}
}

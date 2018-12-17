package day06;

import java.io.File;

/**
 * 删除目录 delete 可以删除一个目录，但前提是该目录为空目录
 * 
 * @author 张新华
 *
 */
public class FileDemo6 {
	public static void main(String[] args) {
		File dir = new File("demo");
		if (dir.exists()) {
			dir.delete();
			System.out.println("删除");
		}
	}
}

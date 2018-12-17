package day06;
/**
 * 属性操作
 */
import java.io.File;
import java.util.Date;

public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("." + File.separator + "demo.txt");
		// 获取名字
		String name = file.getName();
		System.out.println(name);
		// 大小（占用的字节量）
		long length = file.length();
		System.out.println(length);
		// 是否是文件
		boolean isFile = file.isFile();
		System.out.println(isFile);
		// 是否为目录
		boolean isDir = file.isDirectory();
		System.out.println(isDir);
		// 是否为隐藏
		boolean isHid = file.isHidden();
		System.out.println(isHid);
		// 获取最后的修改时间
		long time = file.lastModified();
		Date date = new Date(time);
		System.out.println(date);
		boolean canWrite = file.canWrite();
		System.out.println(canWrite);
	}
}

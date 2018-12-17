package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取目录中符合条件的部分子项 使重载的listFile方法，需要传入一个额外的文件过滤器 文件过滤器是一个借口：FileFilter
 */
public class FileDemo8 {
	public static void main(String[] args) {
		File dir = new File(".");
		/*
		 * 获取名字以"."开头的子项
		 */
		File[] subs = dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				System.out.println("正在过滤" + pathname);
				return pathname.getName().startsWith(".");
			}
		});

		for (File sub : subs) {
			System.out.println(sub.getName());
		}
	}
}

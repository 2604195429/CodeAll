package day06;

import java.io.File;

/**
 * 获取目录中所以子项
 * 
 * @author 张新华
 *
 */
public class FlieDemo7 {
	public static void main(String[] args) {
		/*
		 * 获取目录当前子项
		 */
		File dir = new File(".");
		/*
		 * boolean isDirectory() 判断是否是目录 Boolean isFile() 判断是否是文件
		 */
		if (dir.isDirectory()) {
			/*
			 * File [] listFile 获取所以子项
			 */
			File[] sub = dir.listFiles();
			for (int i = 0; i < sub.length; i++) {
				if (sub[i].isDirectory()) {
					System.out.println("目录" + sub[i].getName());
				} else {
					System.out.println("文件" + sub[i].getName());
				}
			}
		}
	}
}

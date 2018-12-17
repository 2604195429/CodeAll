package day07;
/**
 * 将给定对象转换为字节写出
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class OOSDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("zhang.dat");
		List<String> list = new ArrayList<String>();
		list.add("是你妈");
		Person p = new Person("zz", 2, "男", list);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
	}
}

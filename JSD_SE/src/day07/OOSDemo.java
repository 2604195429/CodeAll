package day07;
/**
 * ����������ת��Ϊ�ֽ�д��
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
		list.add("������");
		Person p = new Person("zz", 2, "��", list);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
	}
}

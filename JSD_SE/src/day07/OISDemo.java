package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("zhang.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p = (Person) ois.readObject();
		System.out.println(p);
		ois.close();
	}
}

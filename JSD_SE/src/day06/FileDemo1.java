package day06;
/**
 * ���Բ���
 */
import java.io.File;
import java.util.Date;

public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("." + File.separator + "demo.txt");
		// ��ȡ����
		String name = file.getName();
		System.out.println(name);
		// ��С��ռ�õ��ֽ�����
		long length = file.length();
		System.out.println(length);
		// �Ƿ����ļ�
		boolean isFile = file.isFile();
		System.out.println(isFile);
		// �Ƿ�ΪĿ¼
		boolean isDir = file.isDirectory();
		System.out.println(isDir);
		// �Ƿ�Ϊ����
		boolean isHid = file.isHidden();
		System.out.println(isHid);
		// ��ȡ�����޸�ʱ��
		long time = file.lastModified();
		Date date = new Date(time);
		System.out.println(date);
		boolean canWrite = file.canWrite();
		System.out.println(canWrite);
	}
}

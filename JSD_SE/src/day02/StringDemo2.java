package day02;

/**
 * �ַ���֧��������ʽ�������� String[] split(String regex) ����ǰ�ַ�����������������ʽ�Ĳ��ֲ�� ���ز�ֻ��ÿ������
 * 
 * @author ���»�
 *
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String str = "abc134def456ghi789";
		/*
		 * �������ֲ�֣���������Ӣ����ĸ����
		 */
		String regex = "\\d";
		String[] array = str.split(regex);
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

package day01;

/**
 * int indexOf��String str�� �÷���ʹ�������Ҹ����ַ����ڵ�ǰ�ַ��� �е�λ�á��÷����м������ط�����
 * 
 * @author ���»�
 *
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String str = "thinking in java";
		// ����in��str�ַ����е�λ�ã���û�л᷵��-1.
		int index = str.indexOf("in");
		System.out.println("index:" + index);
		/*
		 * ���ط��������ָ��λ�ô���ʼ����
		 */
		index = str.indexOf("in", 3);
		System.out.println("index:" + index);
		/*
		 * �������һ�γ���ָ���ַ�����λ�á�
		 */
		index = str.lastIndexOf("in");
		System.out.println("index:" + index);

	}

}

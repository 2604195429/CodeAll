package day01;

/**
 * char charAt(int index) ��ȡ��ǰ�ַ���ָ���±��Ӧ���ַ�
 * 
 * @author ���»�
 *
 */
public class StringDemo5 {

	public static void main(String[] args) {
		String str = "thinking in java";
		// �鿴��5���ַ���ʲô��
		char charAt = str.charAt(4);
		System.out.println(charAt);
		/*
		 * ���һ���ַ����Ƿ�Ϊ����
		 */
		String info = "�Ϻ�����ˮ���Ժ���";
		for (int i = 0; i < info.length() / 2; i++) {
			if (info.charAt(i) != info.charAt(info.length() - 1 - i)) {
				System.out.println("���ǻ��ģ�");
				return;
			}
		}
		System.out.println("�ǻ���");
	}

}

package day02;

/**
 * �ַ���֧��������ʽ���� String replaceAll(String regex, String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻�����ַ���
 * 
 * @author ���»�
 *
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String str = "abc134def456ghi789";
		/*
		 * �����ֲ����滻Ϊ"#NUMBER#"
		 */
		str = str.replaceAll("\\d+", "#NUMBER");
		System.out.println(str);
	}
}

package day02;

/**
 * �ַ���֧��������ʽ����һ�� boolean matchess(String regex)
 * ���ݸ�����������ʽ��֤��ǰ�ַ����Ƿ������ʽҪ�������򷵻�true�����򷵻�false��
 * 
 * @author ���»�
 *
 */
public class StringDemo1 {
	public static void main(String[] args) {
		/*
		 * ��������������ʽ��[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z0-9_]+)+
		 */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)+";
		String mail = "afsdfsa@fafa.cn";
		boolean flag = mail.matches(regex);
		System.out.println(flag);
	}
}

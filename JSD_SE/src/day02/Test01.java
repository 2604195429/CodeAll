package day02;

/**
 * ��֤�ֻ��ŵ�������ʽ
 * 
 * @author ���»�
 *
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ҫ���û�����һ���ֻ��ţ�Ȼ�󾭹� ��֤����Ƿ����ֻ����롣
		 */
		String regex = "(\\\\+86|0086)?\\s*1[0-9]{10}";
		String str = "\\+86   12123123131";
		System.out.println(str);
		System.out.println(regex);
		System.out.println(str.matches(regex));
	}

}

package day02;

/**
 * ��װ���ṩ��һ����̬����parseXXX��String str�� ���Խ��������ַ���ת��Ϊ��Ӧ�Ļ������͡�
 * ǰ���Ǹ��ַ���������ȷ�������������Ϳ��Ա����ֵ
 * 
 * @author ���»�
 *
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		String str = "123.1231";
//		int i = Integer.parseInt(str);
//		System.out.println(i + 1);
		double d = Double.parseDouble(str);
		System.out.println(d + 1);
	}
}

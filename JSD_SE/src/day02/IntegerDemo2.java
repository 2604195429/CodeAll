package day02;

/**
 * �������͵İ�װ��̳���Number ���ṩ���磺intValue,doubleValue������ �����������ǿ��Խ���ǰ��װ���ʾ��������
 * �����������͵���ʽ���ء�
 * 
 * @author ���»�
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		/*
		 * ����������ת��Ϊ��װ�������ַ�ʽ�� 1�����ù��췽�� 2�����þ�̬����valueOf���Ƽ���
		 */
		// ֻ����һ���ֽ�
		Integer i1 = Integer.valueOf(128);
		Integer i2 = Integer.valueOf(128);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

		double d = i1.doubleValue();
		System.out.println(d);

		byte b = i1.byteValue();
		System.out.println(b);
	}
}

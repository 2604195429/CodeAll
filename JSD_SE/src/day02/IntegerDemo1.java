package day02;
/**
 * ��װ��
 * java����8���������ͷֱ����˶�Ӧ�İ�װ��
 * ����װ����ֵ�ԭ����Ϊ�˽���������Ͳ��ܲ���������󿪷�������
 * @author ���»�
 *
 */
public class IntegerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dosome("abc");
		/*
		 * java��8���������ͣ� byte , short,int,long,float,double, char,boolean
		 * ����ֵ����ʽ���ڵģ��������ǲ�û������ �������������ȻҲ���̳���Object�����Բ���ʹ�� ��̬����Object�ĽǶ�ȥ���ܻ������͡�
		 */
		dosome(Integer.valueOf(1));
		dosome(new Point());
	}

	public static void dosome(Object obj) {

	}
}

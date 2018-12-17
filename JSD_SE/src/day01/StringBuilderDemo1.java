package day01;

/**
 * StringBuilber�ṩ�������޸��ַ��� ���ݵ���ط����� ���ڲ�ά������һ���ɱ���ַ����飬���� �޸Ķ����ڵ�ǰ�����ڲ���ɵġ�
 * ��Ƶ���޸��ַ�������ʱӦ��ʹ�õ�ǰ�����
 * 
 * @author ���»�
 *
 */
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		String str = "Ŭ��ѧϰjava";
		/*
		 * ��Stringת��ΪStringBuilber ����ʹ���вεĹ��췽���� StringBuilberҲ���޲ι��췽����Ĭ�� ��ʾ���ַ���
		 */
		StringBuilder builder = new StringBuilder(str);
		/*
		 * ��StringBuilderת��ΪString ʹ��StringBuilder��toString�������ɡ�
		 */
		str = builder.toString();

		/*
		 * StringBuilder append(String str) ��ǰ�ַ���ĩβ��ָ�����ݡ� ���������ط������������Ͳ�ͬ����Щ���ط���
		 * ����׷���������ݣ���ת��Ϊ�ַ�����׷�ӣ�
		 */
		builder.append(",Ϊ���Ҹ��ù�����");
		System.out.println(builder.toString());
		/*
		 * StringBuilder replace(int start,int end,String str) ��ָ����Χ�ڵ��ַ����滻Ϊָ��������
		 */
		builder.replace(str.length(), builder.length(), ",����Ϊ�˸ı�����!");
		System.out.println(builder.toString());
		/*
		 * StringBuilder delete(int start,int end) ����ǰ�ַ�����ָ����Χ�ڵ�����ɾ����
		 */
		builder.delete(0, str.length());
		System.out.println(builder.toString());
		/*
		 * StringBuilder insert(int index,String str) �������ַ������뵽ָ��λ�ã�ԭλ�ü������ַ���ѭ������ƶ���
		 * 
		 */
		builder.insert(0, "����");
		System.out.println(builder.toString());
		// ��ת�ַ���
		builder.reverse();
		System.out.println(builder.toString());
	}
}

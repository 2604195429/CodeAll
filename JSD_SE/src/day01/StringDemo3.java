package day01;

/**
 * String substring(int start, int end) ��ȡ�ַ�������ָ��λ�ã�start����ʼ��ȡ��ָ����λ�ã�end�� java
 * qpi��һ���ص㣬ͨ�����������ֱ�ʾ��Χʱ�����Ǻ�ͷ����β��
 * 
 * @author ���»�
 *
 */
public class StringDemo3 {

	public static void main(String[] args) {
		String str = "thinking in java";
		// ��ȡ"ing"
		String sub = str.substring(5, 8);
		System.out.println("sub:" + sub);
		String host = "www.tedu.cn";
		// sub = host.substring(4,8);
		/*
		 * ��ֻ��һ�����������Ǵ�ָ����λ�ÿ�ʼ ��ȡ���ַ���ĩβ
		 */
		sub = host.substring(4);
		System.out.println("sub:" + sub);
	}

}

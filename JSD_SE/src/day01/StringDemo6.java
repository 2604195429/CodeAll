package day01;

/**
 * boolean startsWith(String str) boolean endsWith(String str)
 * �жϵ�ǰ�ַ����Ƿ�����ָ�����ַ�����ʼ���β�ġ�
 * 
 * @author ���»�
 *
 */
public class StringDemo6 {

	public static void main(String[] args) {
		String str = "thinking in java";
		boolean starts = str.startsWith("thi");
		System.out.println(starts);
		boolean ends = str.endsWith("java");
		System.out.println("ends:" + ends);
	}

}

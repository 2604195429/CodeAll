package day02;

/**
 * 
 * @author ���»�
 *
 */
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "(wqnmlgb|cnm|sb|2b|nc|tmd)";
		String message = "���sb";
		message = message.replaceAll(regex, "**");
		System.out.println(message);
	}

}

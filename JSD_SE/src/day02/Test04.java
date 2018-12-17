package day02;

/**
 * 
 * @author 张新华
 *
 */
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "(wqnmlgb|cnm|sb|2b|nc|tmd)";
		String message = "你个sb";
		message = message.replaceAll(regex, "**");
		System.out.println(message);
	}

}

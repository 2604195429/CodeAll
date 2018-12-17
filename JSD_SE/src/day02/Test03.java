package day02;

public class Test03 {
	public static void main(String[] args) {
		String imgName = "1.jpg";
		imgName = imgName.replaceAll(".+\\.", System.currentTimeMillis() + ".");
		System.out.println(imgName);
	}
}

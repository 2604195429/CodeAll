package day02;

/**
 * 图片重命名
 * 
 * @author 张新华
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String imgName = "1.jpg";
		String[] names = imgName.split("\\.");
		imgName = "" + System.currentTimeMillis() + "." + names[1] + "";
		System.out.println(imgName);
	}
}

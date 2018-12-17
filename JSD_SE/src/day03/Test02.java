package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入自己的生日，格式为：1992-07-13 经过计算，输出：到今天为止一共活了多少天。 存活10000天的纪念日是：2018-12-05
 */
public class Test02 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你自己的生日");
		String str = scanner.nextLine();
		Date time = sdf.parse(str);
		Long bir = time.getTime();
		Long now = new Date().getTime();
		Long live = now - bir;
		Long remember = bir + 10000l * 1000 * 60 * 60 * 24;
		time.setTime(remember);
		System.out.println("到今天活了" + live / 1000 / 60 / 60 / 24 + "存活10000天的纪念日为" + sdf.format(time) + "");

	}

}

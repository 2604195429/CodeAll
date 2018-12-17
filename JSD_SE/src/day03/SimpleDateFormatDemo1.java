package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 当前系统时间
		Date now = new Date();
		System.out.println(now);

		/*
		 * Date->String String format(Date date)
		 * format方法可以将给定的Date对象按照SimpleDateFormat指定的日期格式转换为字符串
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(now));
	}

}

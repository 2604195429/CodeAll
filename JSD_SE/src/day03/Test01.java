package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 查看当前系统时间和16天5小时23分40秒以后的日期显示格式： 2014年22月23日 23：32：32
 * 
 * @author 张新华
 *
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now);
		Long time = now.getTime();
		time += 16 * 24 * 60 * 60 * 1000 + 5 * 60 * 60 * 1000 + 23 * 60 * 1000 + 40 * 1000;
		now.setTime(time);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
		System.out.println(sdf.format(now));
	}

}

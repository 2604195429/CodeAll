package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �鿴��ǰϵͳʱ���16��5Сʱ23��40���Ժ��������ʾ��ʽ�� 2014��22��23�� 23��32��32
 * 
 * @author ���»�
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

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm��ss");
		System.out.println(sdf.format(now));
	}

}

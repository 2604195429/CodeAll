package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Ҫ���û������Լ������գ���ʽΪ��1992-07-13 �������㣬�����������Ϊֹһ�����˶����졣 ���10000��ļ������ǣ�2018-12-05
 */
public class Test02 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������Լ�������");
		String str = scanner.nextLine();
		Date time = sdf.parse(str);
		Long bir = time.getTime();
		Long now = new Date().getTime();
		Long live = now - bir;
		Long remember = bir + 10000l * 1000 * 60 * 60 * 24;
		time.setTime(remember);
		System.out.println("���������" + live / 1000 / 60 / 60 / 24 + "���10000��ļ�����Ϊ" + sdf.format(time) + "");

	}

}

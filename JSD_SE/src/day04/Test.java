package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ��������� �û������������� ���ͱ������� Ҫ�����ǰ��������Ϊ������
 * 
 * @author ���»�
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(scanner.nextLine());
		int days = Integer.parseInt(scanner.nextLine());
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, days);
		calendar.add(Calendar.WEEK_OF_YEAR, -2);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(sdf.format(calendar.getTime()));
	}

}

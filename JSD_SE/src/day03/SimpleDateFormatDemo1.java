package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ǰϵͳʱ��
		Date now = new Date();
		System.out.println(now);

		/*
		 * Date->String String format(Date date)
		 * format�������Խ�������Date������SimpleDateFormatָ�������ڸ�ʽת��Ϊ�ַ���
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(now));
	}

}

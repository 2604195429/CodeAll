package day02;

/**
 * 字符串支持正则表达式方法二： String[] split(String regex) 讲当前字符串按照满足正则表达式的部分拆分 返回拆分或的每段内容
 * 
 * @author 张新华
 *
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String str = "abc134def456ghi789";
		/*
		 * 按照数字拆分，保留所有英文字母部分
		 */
		String regex = "\\d";
		String[] array = str.split(regex);
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

package day01;

/**
 * StringBuilber提供了用于修改字符串 内容的相关方法。 其内部维护的是一个可变的字符数组，多以 修改都是在当前对象内部完成的。
 * 当频繁修改字符串内容时应当使用当前类完成
 * 
 * @author 张新华
 *
 */
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		String str = "努力学习java";
		/*
		 * 将String转化为StringBuilber 可以使用有参的构造方法。 StringBuilber也有无参构造方法，默认 表示空字符串
		 */
		StringBuilder builder = new StringBuilder(str);
		/*
		 * 从StringBuilder转换为String 使用StringBuilder的toString方法即可。
		 */
		str = builder.toString();

		/*
		 * StringBuilder append(String str) 向当前字符串末尾加指定内容。 有若干重载方法，参数类型不同，这些重载方法
		 * 允许追加其他内容（先转换为字符串再追加）
		 */
		builder.append(",为了找个好工作！");
		System.out.println(builder.toString());
		/*
		 * StringBuilder replace(int start,int end,String str) 将指定范围内的字符串替换为指定的内容
		 */
		builder.replace(str.length(), builder.length(), ",就是为了改变世界!");
		System.out.println(builder.toString());
		/*
		 * StringBuilder delete(int start,int end) 将当前字符串中指定范围内的内容删除。
		 */
		builder.delete(0, str.length());
		System.out.println(builder.toString());
		/*
		 * StringBuilder insert(int index,String str) 将给定字符串插入到指定位置，原位置及后续字符串循序想后移动。
		 * 
		 */
		builder.insert(0, "活着");
		System.out.println(builder.toString());
		// 反转字符串
		builder.reverse();
		System.out.println(builder.toString());
	}
}

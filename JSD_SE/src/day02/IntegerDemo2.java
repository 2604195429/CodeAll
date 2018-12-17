package day02;

/**
 * 数字类型的包装类继承自Number 其提供了如：intValue,doubleValue这样的 方法，作用是可以将当前包装类表示的数字以
 * 其他数字类型的形式返回。
 * 
 * @author 张新华
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		/*
		 * 将基本类型转换为包装类有两种方式： 1：调用构造方法 2：调用静态方法valueOf（推荐）
		 */
		// 只缓存一个字节
		Integer i1 = Integer.valueOf(128);
		Integer i2 = Integer.valueOf(128);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

		double d = i1.doubleValue();
		System.out.println(d);

		byte b = i1.byteValue();
		System.out.println(b);
	}
}

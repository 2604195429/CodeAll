package day02;

/**
 * 数字类型包装类都支持两个常量： MAX_VALUE,MIN_VALUE 分别保存了对应基本类型的最大值与最小值
 * 
 * @author 张新华
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		// 获取int最大值
		int imax = Integer.MAX_VALUE;
		int imin = Integer.MIN_VALUE;
		System.out.println(imax);
		System.out.println(imin);

		double dmax = Double.MAX_VALUE;
		double dmin = Double.MIN_VALUE;
		System.out.println(dmax);
		System.out.println(dmin);
	}
}

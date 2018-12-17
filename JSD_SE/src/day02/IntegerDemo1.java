package day02;
/**
 * 包装类
 * java对于8个基本类型分别定义了对应的包装类
 * 而包装类出现的原因是为了解决基本类型不能参与面向对象开发的问题
 * @author 张新华
 *
 */
public class IntegerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dosome("abc");
		/*
		 * java的8个基本类型： byte , short,int,long,float,double, char,boolean
		 * 是以值得形式存在的，所以他们并没有面向 对象的特征，自然也不继承自Object。所以不能使用 多态，用Object的角度去接受基本类型。
		 */
		dosome(Integer.valueOf(1));
		dosome(new Point());
	}

	public static void dosome(Object obj) {

	}
}

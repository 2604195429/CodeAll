package day02;

/**
 * JDK1.5之后推出了一个新的特性 自动插装箱
 * 
 * @author 张新华
 *
 */
public class IntegerDemo5 {
	/*
	 *自动差装箱是编译器认可， 而不是虚拟机认可的。
	 *编译器在将源程序编译时自动补充代码来完成
	 *基本类型与包装类之间的转换。
	 *
	 * 下面代码触发了自动拆箱：
	 * 在class文件中，下面的代码背编译器改为： 
	 *  
	 */
	// int i = Integer.valueOf(1).intValue();
	int i = Integer.valueOf(1);
	/*
	 * 下面代码触发了自动装箱：
	 */
	// Integer ii =Integer.valueOf(123);
	Integer ii = 132;
}

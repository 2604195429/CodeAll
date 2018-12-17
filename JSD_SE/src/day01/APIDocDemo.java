package day01;

/**
 * 文档注释 文档注释可以对类，方法，常量进行修饰。 文档注释最终可以被javadoc命令所解释，然后 生成一个文档手册。
 *
 * 当前类是用来测试文档注释的使用规范。
 * 
 * @author Lvlv
 * @version 1.0 17/11/25
 * @see java.lang.String
 * @since JDK1.0
 */
public class APIDocDemo {
	/**
	 * sayHello用到的问候语
	 */
	public static final String INFO = "你好！";

	/**
	 * 为指定的用户添加一个问候语
	 * 
	 * @param name
	 *            指定的用户的名字
	 * @return 添加问候语后的字符串
	 */
	public static String main(String name) {
		return INFO + name;
	}

}

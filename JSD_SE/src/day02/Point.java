package day02;

/**
 * 使用该类来测试Object相关方法的重写。 该类的每一个实例表示直角坐标系上的一个点。
 * 
 * @author 张新华
 *
 */
public class Point {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	/*
	 * 通常我们要使用一个类的toString方法是，就应当重写该方法。 Object自身的toString方法返回的是：类名@地址
	 * 这个字符串没有是什么实际意义。 重写该方法后，返回的字符串没有严格的格式要求， 将来可以根据需求而定。但是原则上该字符串中应当 包含当前对象的属性信息。
	 * 只有我们自定义的类需要重写该方法，JAVA API提供的类 通常都已经重写了该方法
	 */

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.x + "," + this.y + ")";
	}

	/**
	 * 通常，当我们需要使用一个类的equals方法时， 就应当重写它。 equals方法的作用上市比较当前对象与给定对象内容是否一样（长得像不像）
	 * Object提供的equals方法内部就是用“==”实现的所以没有意义 equals比较时不一定要求所有属性值都要相同，这要结合实际需要而定
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj instanceof Point) {
			Point p = (Point) obj;
			return this.x == p.x && this.y == p.y;
		}
		return false;
	}
}

package day05;

/**
 * 该类用于作为集合的元素
 * 
 * @author 张新华
 *
 */
public class Point implements Comparable<Point> {
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

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

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	/*
	 * 该方法的作用是定义当前对象与给定对象比较大小的规则 返回值为一个int值，该值表示大小关系，它不关注具体的取值是多少，而是取值范围
	 * 当返回值>0时：当前对象大，当返回值<0时：当前对象小，当返回值=0时，当前对象与给定对象相等
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		// 比较到原点的长
		int len = this.x * this.x + this.y * this.y;
		int olen = o.x * o.x + o.y * o.y;
		return len - olen;
	}
}

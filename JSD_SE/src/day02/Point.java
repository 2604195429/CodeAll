package day02;

/**
 * ʹ�ø���������Object��ط�������д�� �����ÿһ��ʵ����ʾֱ������ϵ�ϵ�һ���㡣
 * 
 * @author ���»�
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
	 * ͨ������Ҫʹ��һ�����toString�����ǣ���Ӧ����д�÷����� Object�����toString�������ص��ǣ�����@��ַ
	 * ����ַ���û����ʲôʵ�����塣 ��д�÷����󣬷��ص��ַ���û���ϸ�ĸ�ʽҪ�� �������Ը����������������ԭ���ϸ��ַ�����Ӧ�� ������ǰ�����������Ϣ��
	 * ֻ�������Զ��������Ҫ��д�÷�����JAVA API�ṩ���� ͨ�����Ѿ���д�˸÷���
	 */

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.x + "," + this.y + ")";
	}

	/**
	 * ͨ������������Ҫʹ��һ�����equals����ʱ�� ��Ӧ����д���� equals�������������бȽϵ�ǰ������������������Ƿ�һ������������
	 * Object�ṩ��equals�����ڲ������á�==��ʵ�ֵ�����û������ equals�Ƚ�ʱ��һ��Ҫ����������ֵ��Ҫ��ͬ����Ҫ���ʵ����Ҫ����
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

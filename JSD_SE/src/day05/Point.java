package day05;

/**
 * ����������Ϊ���ϵ�Ԫ��
 * 
 * @author ���»�
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
	 * �÷����������Ƕ��嵱ǰ�������������Ƚϴ�С�Ĺ��� ����ֵΪһ��intֵ����ֵ��ʾ��С��ϵ��������ע�����ȡֵ�Ƕ��٣�����ȡֵ��Χ
	 * ������ֵ>0ʱ����ǰ����󣬵�����ֵ<0ʱ����ǰ����С��������ֵ=0ʱ����ǰ����������������
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		// �Ƚϵ�ԭ��ĳ�
		int len = this.x * this.x + this.y * this.y;
		int olen = o.x * o.x + o.y * o.y;
		return len - olen;
	}
}

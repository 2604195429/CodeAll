package day04;

public class PointTest2 {
	public static void main(String[] args) {
		/*
		 * ����ָ�����͵�ʵ������ΪInteger ��ʵ���ϣ�����Point����x��y����Ϊobject������ֻ�ǰ�������Integer������
		 */
		Point<Integer> p = new Point<Integer>(2, 3);
		/*
		 * ���ڲ�����T ���������֤�����Ƿ�ΪInteger�� �����ǣ���֤ʧ�� ���Դ��������������Ϊ�����Զ�װ��
		 */
		p.setX(1);
		/*
		 * ��ȡʱ�Զ�����
		 */
		int x1 = p.getX();

		/*
		 * ����ָ�����ͣ���Ĭ��Object������
		 */
		Point p2 = p;
		p2.setX("fsa");
		x1 = p.getX();
		System.out.println(x1);
	}
}

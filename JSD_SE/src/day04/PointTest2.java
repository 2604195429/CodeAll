package day04;

public class PointTest2 {
	public static void main(String[] args) {
		/*
		 * 这里指定泛型的实际类型为Integer 但实际上，创建Point对象x，y属性为object，这里只是把它当成Integer来看待
		 */
		Point<Integer> p = new Point<Integer>(2, 3);
		/*
		 * 由于参数是T ，这里会验证参数是否为Integer， 若不是，验证失败 可以传入最基本类型因为可以自动装箱
		 */
		p.setX(1);
		/*
		 * 获取时自动造型
		 */
		int x1 = p.getX();

		/*
		 * 若不指定泛型，则默认Object的类型
		 */
		Point p2 = p;
		p2.setX("fsa");
		x1 = p.getX();
		System.out.println(x1);
	}
}

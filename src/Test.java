/**
 * @author dev.kashyap
 * 
 *         Apple Interview
 * 
 *         Test o1 = new Test(new Integer(3) , new Integer(13) ) ==> 16
 * 
 *         Test o2 = new Test(new Test (1,2) , new Integer(4)) == > 7
 * 
 *         Test o3 = new Test(new Test (1,2) ,new Test (1,21)) ==> 25
 *
 */
public class Test {

	Object x;
	Object y;

	public Test(Object x, Object y) {
		this.x = x;
		this.y = y;
	}

	public int sum() {
		return add(x) + add(y);

	}

	int add(Object x) {
		if (x == null) {
			return 0;
		}

		if (x instanceof Test) {
			Test t = (Test) x;
			return add(t.x) + add(t.y);
		} else {
			Integer t = (Integer) x;
			return t;
		}

	}

	public static void main(String[] args) {
		Test o1 = new Test(new Integer(3), new Integer(13));
		System.out.println(" sum : " + o1.sum());

		Test o3 = new Test(new Test(1, 2), new Test(1, 21));
		System.out.println(o3.sum());

	}
}

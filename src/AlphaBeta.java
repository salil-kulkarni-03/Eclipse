
public class AlphaBeta {
	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.demo();
		Beta b = new Beta();
		b.test();
		Alpha ab = b;  // Up casting
		ab.demo();
		//ab.test();   Error
		Beta ba = (Beta) ab;    // Down casting
		ba.test();
	}
}

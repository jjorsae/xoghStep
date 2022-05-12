package J_Study;

public class Lambda {
	public static void main(String[] args) {
		System.out.println(new Lambda() {
			public int ma(int a, int b) {
				return a>b?a:b;
			}
		}.ma(3, 5));
	}
}
